package sk.upjs.ics.todo;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlUlohaDao implements UlohaDao{
    private JdbcTemplate jdbcTemplate;
    public MySqlUlohaDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/todo");
        dataSource.setUser("toDo");
        dataSource.setPassword("toDo");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void pridat(Uloha uloha) {
        String sql = "INSERT INTO uloha VALUES (?,?,?,?)";
        jdbcTemplate.update(sql,null,uloha.getNazov(),uloha.getDate(),uloha.isSplnena());
    }

    @Override
    public List<Uloha> dajVsetky() {
        String sql = "select * from uloha";
        BeanPropertyRowMapper<Uloha> mapper = BeanPropertyRowMapper.newInstance(Uloha.class);
        return jdbcTemplate.query(sql, mapper); /*dam dopyt a mapper a vypuje zoznam uloh ktore mozme pouzit*/
    }

    @Override
    public void odstranit(Uloha uloha) {
        String sql = "delete from uloha where id = ?";
        jdbcTemplate.update(sql, uloha.getId());
    }
}
