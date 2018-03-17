package com.brainmentors.apps.myresteg;

import java.util.ArrayList;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	
	
	
	@GET
	@Path("/empxml")
	@Produces({ MediaType.APPLICATION_XML })
	public Employee getAllXMLEmployee(){
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Ram");
		emp.setSalary(9090.00);
		//emp.setDesignation("Manager");
		return emp;
	}
	
	@GET
	@Path("/MyWSHTML")
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLMessage(){
		return "<h1>Hello Client </h1>";
		
	}

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
	@Path("formparamsws")
	@POST
	public Response addUserDetails(@FormParam("name") String name, 
			@FormParam("age") int age, @FormParam("address") String address){
		System.out.println("Inside Person "+age+" "+name+" "+address);
		Person person = new Person(age, name, address);
		person = PersonOperations.addPerson(person);
		return Response.status(200).entity(person.toString()).build();
	}
	
	@Path("/getpersons")
	@GET
	public Response getUsers(){
		ArrayList<Person> personList = PersonOperations.getPersons();
		return Response.status(200).entity(personList.toString()).build();
	}
	
	@GET
	@Path("/matrix")
	public Response getUserDetails(@MatrixParam("name") String name, 
			@MatrixParam("age") int age, @MatrixParam("address") String address ){
		return Response
				.status(200)
				.entity("User Details Name " + name
					+ ", age : " + age + ", Address : " + address)
				.build();
	}
	
	@GET
	@Path("/query")

	public Response getData(@DefaultValue("Amit") @QueryParam("name") String name, 
			@DefaultValue("27") @QueryParam("age") int age, @DefaultValue("Shakti Nagar") @QueryParam("address") String address)
	{
		
		System.out.println("Inside Person "+age+" "+name+" "+address);
		Person person = new Person(age, name, address);
		person = PersonOperations.addPerson(person);
		return Response.status(200).entity(person.toString()).build();
//		Employee e = new Employee();
//		e.setId(1001);
//		e.setName("Ram");
//		e.setSalary(9009);
//		Gson gson = new Gson();
//		String json = gson.toJson(e);
//	return Response.status(200).entity(json).build();	
	}
	
	@Path("empmap/{id}/{name}/{salary}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmpMap(@PathParam("id") int id,@PathParam("name") String name, @PathParam("salary") double salary){
		Employee f = new Employee();
		f.setId(id);
		f.setName(name);
		f.setSalary(salary);
		System.out.println("Id "+id+" Name "+name+" Salary "+salary);
		
		return "{status:'Success',message:'Saved...'}";
		
//		Employee emp = new Employee();
//		if(id>100){
//			
//			emp.setId(1001);
//			emp.setName("Ram");
//			emp.setSalary(9090);
//		}
//		else{
//			
//			emp.setId(1002);
//			emp.setName("Mike");
//			emp.setSalary(19090);
//		}
//		
//		
//		Address address = new Address();
//		address.setCity("Delhi");
//		address.setState("Delhi");
//		EmpAddress ea  = new EmpAddress();
//		ea.setAddress(address);
//		ea.setEmp(emp);
//		Gson gson = new Gson();
//		String json = gson.toJson(ea);
////		HashMap<String,String> map = new HashMap<>();
////		map.put("name",emp.getName());
////		map.put("city",address.getCity());
////		Gson gson = new Gson();
////		String json= gson.toJson(map);
//		return json;
	}
   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
