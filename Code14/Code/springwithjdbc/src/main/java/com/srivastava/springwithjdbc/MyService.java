package com.srivastava.springwithjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	EmployeeDTO empDTO;
	@Autowired
	JdbcTemplate jdbcTemplate;
	public String  addEmployee(int id , String name, double salary) {
		empDTO.setId(id);
		empDTO.setName(name);
		empDTO.setSalary(salary);
		jdbcTemplate.update("insert into emp (id,name,salary) values(?,?,?) ", new Object[] {
				id , name, salary
		});
		return "Record Added";
	}
	
	public List<EmployeeDTO> findBySalary(double salary){
		
		return jdbcTemplate.query("select * from emp where salary>?", new Object[] {salary},new EmpRowMapper());
	}
	
	public EmployeeDTO findById(int id) {
		return jdbcTemplate.queryForObject("select * from emp where id=?", new Object[] {
			id	
		},new BeanPropertyRowMapper<EmployeeDTO>(EmployeeDTO.class));
	}
	
	
}
