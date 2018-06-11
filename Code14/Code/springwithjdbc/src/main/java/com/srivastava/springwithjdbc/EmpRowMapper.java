package com.srivastava.springwithjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpRowMapper implements RowMapper<EmployeeDTO> {

	@Override
	public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(rs.getInt("id"));
		employeeDTO.setName(rs.getString("name"));
		employeeDTO.setSalary(rs.getDouble("salary"));
		return employeeDTO;
	}

}
