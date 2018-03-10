package com.brainmentors.apps.myresteg;

import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	@Path("welcome")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello(){
		return "Welcome ";
	}
	
	@Path("testjson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String emp(){
		Employee emp= new Employee();
		emp.setId(1001);
		emp.setSalary(9090);
		emp.setName("Ram");
		Gson gson = new Gson();
		String json = gson.toJson(emp);
		return json;
		//return "Welcome ";
	}
	
	@Path("emp")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmp(){
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Ram");
		emp.setSalary(9090);
		Address address = new Address();
		address.setCity("Delhi");
		address.setState("Delhi");
		EmpAddress ea  = new EmpAddress();
		ea.setAddress(address);
		ea.setEmp(emp);
		Gson gson = new Gson();
		String json= gson.toJson(ea);
		return json;
	}
	
	
	@Path("empmap/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmpMap(@PathParam("id") int id){
		Employee emp = new Employee();
		if(id>100){
			
			emp.setId(1001);
			emp.setName("Ram");
			emp.setSalary(9090);
		}
		else{
			
			emp.setId(1002);
			emp.setName("Mike");
			emp.setSalary(19090);
		}
		
		
		Address address = new Address();
		address.setCity("Delhi");
		address.setState("Delhi");
		EmpAddress ea  = new EmpAddress();
		ea.setAddress(address);
		ea.setEmp(emp);
		Gson gson = new Gson();
		String json = gson.toJson(ea);
//		HashMap<String,String> map = new HashMap<>();
//		map.put("name",emp.getName());
//		map.put("city",address.getCity());
//		Gson gson = new Gson();
//		String json= gson.toJson(map);
		return json;
	}
   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
