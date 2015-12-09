/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.todo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author student
 */
public class KategoriaRowMapper implements RowMapper<Kategoria>{

    @Override
    public Kategoria mapRow(ResultSet rs, int i) throws SQLException {
       
    }
    
}
