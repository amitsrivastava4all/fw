package com.brainmentors.apps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.brainmentors.apps.dto.UserDTO;
@Component
public class UserDAO implements IUserDAO {

	private JdbcTemplate jdbc;
	
	public UserDAO(DataSource datasource){
		jdbc = new JdbcTemplate(datasource);
	}
	
	@Override
	public UserDTO doLogin(UserDTO userDTO) throws Exception {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user_mst WHERE userid='" 
		+ userDTO.getUserid()+"' and password='"+userDTO.getPassword()+"'";
	   // int z = jdbc.update("insert ??", new Object[]{1001,"ram"});
		
	    return (UserDTO) jdbc.query(sql, new ResultSetExtractor() {

			@Override
			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next()){
					System.out.println("Record... ");
					UserDTO userDTOObject  = new UserDTO();
					userDTOObject.setId(rs.getInt("uid"));
					userDTOObject.setUserid(rs.getString("userid"));
					System.out.println("UserDTO Object is "+userDTOObject);
					Object object = userDTOObject;
					return object;
				}
				return null;
			}
	 
	       
	    });
	}

}
