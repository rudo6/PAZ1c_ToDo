/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.todo;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

/**
 *
 * @author student
 */
public class MySqlKategoriaDao implements KategoriaDao{
    private JdbcTemplate jdbcTemplate;
    
    public MySqlKategoriaDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/todo");
        dataSource.setUser("toDo");
        dataSource.setPassword("toDo");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public List<Kategoria> dajVsetky() {
        String sql = "select * from kategoria left outer join uloha on uloha.kategoria_id = kategoria.id;";
        KategoriaRowCallHandler handler = new KategoriaRowCallHandler();
        jdbcTemplate.query(sql, handler);
        return handler.getKategorie();
    }
    
    /*public static void main(String[] args){
        List<Kategoria> dajVsetky = new MySqlKategoriaDao().dajVsetky();
        System.out.println(dajVsetky);
    }*/
    
}
