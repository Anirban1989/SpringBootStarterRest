package com.javasampleapproach.restdata.repository;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
/*import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
*/
import com.javasampleapproach.restdata.model.Customer;
/**
 * The Class PersonDAOImpl.
 */
//@Repository
public class PersonDAOImpl {

    /** The jdbc template. */
    //@Autowired
    //private NamedParameterJdbcTemplate jdbcTemplate;

    /**
     * Gets the person details.
     *
     * @param email the email
     * @return the person details
     */
    /*public Customer getCustomerDetails(String email) {
        String query = "select";
        SqlParameterSource parameterSource = new MapSqlParameterSource("email", email);

        try {
            return jdbcTemplate.queryForObject(query, parameterSource, new RowMapper<Customer>() {
                @Override
                public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                	Customer person = new Customer();
                    return person;
                }
            });
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }*/

}
