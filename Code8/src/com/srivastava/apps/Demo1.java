package com.srivastava.apps;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Demo1 {
	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	public static void search()
	{
		Session session = sessionFactory.openSession();
		Query q = session.getNamedQuery("nativequery");
		//Query query = session.getNamedQuery("selectAll");
		//query.setParameter("sal", 9000.0);
		List<Employee> empList = q.list();
		System.out.println("Result is "+empList);
		session.close();
	}
	
	public void getMap()
	{
		Session session = sessionFactory.openSession();
		
			Query query = session.createQuery("select new map(name,salary)"
					+ " from Employee");
		
			List<Map<String,Integer>> empList = (List<Map<String,Integer>>)query.list();
			if(empList!=null && empList.size()>0){
				for(Map<String,Integer> map : empList){
					
						System.out.println(map);
					
				}
			}
			session.close();
			
	}
	
	public void getNameList()
	{
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("select name from Employee");
	
		
		List<String> empList = (List<String>)query.list();
		//empList.get(0)
		if(empList!=null && empList.size()>0){
			for(String name : empList){
				
					System.out.println(name);
				
			}
		}
		session.close();
	}
	public void getMaxSalary()
	{
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery("select max(salary) from Employee");
	
		List empList = (List)query.list();
		if(empList!=null && empList.size()>0){
			System.out.println("Max Salary "+empList.get(0));
		}
		session.close();
	}
	public void pagination()
	{
		Session session = sessionFactory.openSession();
	/*	Transaction transaction = session.getTransaction();
		transaction.begin();*/
		Query query = session.createQuery("from Employee");
		query.setFirstResult(1);
		query.setMaxResults(10);
		//Query query = session.createQuery("from Employee where salary>1000");
		List<Employee> empList = (List<Employee>)query.list();
		if(empList!=null && empList.size()>0){
			for(Employee obj : empList){
				
					System.out.println(obj);
				
			}
		}
		session.close();
		
	}
	/*
	 *SQL Injection Example
	 */
	public void sqlInjection()
	{
		Session session = sessionFactory.openSession();
			String value ="900000 or 1=1";
			Query query = session.createQuery("from Employee where salary>"+value);
			
			List<Employee> empList = (List<Employee>)query.list();
			if(empList!=null && empList.size()>0){
				for(Employee obj : empList){
					
						System.out.println(obj);
					
				}
			}
			session.close();
	}
	/*
	 * Parameter Binding prevention for SQL Injection
	 * Using Position Parameter Binding	
	 */
	public void parameterBinding()
	{
		Session session = sessionFactory.openSession();
		
		double salary= 9000.0;
			Query query = session.createQuery("from Employee "
					+ "where salary>? and name=?");
			//query.setDouble(0, salary);
			//query.setString(1, "JIM");
			query.setParameter(0, salary);
			query.setParameter(1, "JIM");
			List<Employee> empList = (List<Employee>)query.list();
			if(empList!=null && empList.size()>0){
				for(Employee obj : empList){
					
						System.out.println(obj);
					
				}
			}
			session.close();
	}
	public void namedParameterBinding()
	{
		Session session = sessionFactory.openSession();
		
		double salary= 9000.0;
			Query query = session.createQuery("from Employee"
					+ " where salary>:sal");
			query.setDouble("sal", salary);
			
			List<Employee> empList = (List<Employee>)query.list();
			if(empList!=null && empList.size()>0){
				for(Employee obj : empList){
					
						System.out.println(obj);
					
				}
			}
			session.close();
	}
	
	
	
	
	// Using HQL
		public static void find(String value)
		{
			Session session = sessionFactory.openSession();
		/*	Transaction transaction = session.getTransaction();
			transaction.begin();*/
			Query query = session.createQuery("from Employee where salary>"
					+value);
			//Query query = session.createQuery("from Employee where salary>1000");
			List<Employee> empList = (List<Employee>)query.list();
			if(empList!=null && empList.size()>0){
				for(Employee obj : empList){
					
						System.out.println(obj);
					
				}
			}
			else{
				System.out.println("No Record Found...");
			}
			session.close();
			
		}
	
	static void add(){
		Employee ram = new Employee(1005, "JIM", 17999); // Transient
		Address a = new Address("New Delhi","110007","Delhi");
		Address a2 = new Address("Old Delhi","110006","Delhi");
		Address a3 = new Address("Old Delhi","110006","Delhi");
		ram.setAddress(a);
		ram.setAdd(a2);
		Set<Address> addressList = new HashSet<>();
		addressList.add(a);
		addressList.add(a2);
		addressList.add(a3);
		
		ram.setAddressList(addressList);
		Session session = sessionFactory.openSession();  // Connection Open
		Transaction transaction = session.beginTransaction();
		Employee emp  = session.get(Employee.class, 1);
		/*if(emp!=null){
			System.out.println("Found..."+emp);
			//emp.setSalary(200000);
			//session.update(emp);
		}
		else{
			System.out.println("Not Found...");
		}
		*/
		session.save(ram);
		//ram.setSalary(100000);
		transaction.commit();
		session.close();
		/*emp.setSalary(300000);
		Session session2 = sessionFactory.openSession();
		 transaction = session2.beginTransaction();
		 Employee emp2  = session2.get(Employee.class, 1);
		 session2.merge(emp);
		transaction.commit();
		System.out.println("Record Updated...");
		session2.close();
		*/
	}
	
	static void find(){
		
		Session session = sessionFactory.openSession();  // Connection Open
		//Transaction transaction = session.beginTransaction();
		Employee emp = 
				session.get(Employee.class, 1001);
		if(emp==null){
			System.out.println("No Record Found...");
		}
		else{
			System.out.println(emp);
		}
		//transaction.commit();
		session.close();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		String salary = sc.nextLine();
		find(salary);
		sc.close();
		//find();
		

	}

}
