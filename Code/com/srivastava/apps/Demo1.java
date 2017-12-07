package com.srivastava.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo1 {
	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	static void add(){
		Employee ram = new Employee(1002, "Shyam", 9999); // Transient
		Session session = sessionFactory.openSession();  // Connection Open
		Transaction transaction = session.beginTransaction();
		session.save(ram);
		transaction.commit();
		session.close();
		System.out.println("Record Added...");
		
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
		find();
		

	}

}
