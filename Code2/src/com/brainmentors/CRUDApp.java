package com.brainmentors;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUDApp {

	SessionFactory sessionFactory ;
	CRUDApp(){
		load();
	}
	void load(){
		Configuration config = new Configuration().configure();
		sessionFactory = config.buildSessionFactory();
		
		
	}
	
	void search(int id){
		Integer i  = id;
		Session session = sessionFactory.openSession();
		System.out.println("Before....");
		Employee employee= session.load(Employee.class, i);
		
		System.out.println("After ......");
		Employee employee2= session.load(Employee.class, i);
		if(employee!=null){
			System.out.println("Printing....");
		System.out.println(employee);
		}
		else{
			System.out.println("No Record Found...");
		}
		session.close();
	}
	
	void add(){
		Employee employee = new Employee();
		employee.setId(1003);
		employee.setName("Mike");
		employee.setSalary(9090);
		employee.setAtt(true);
		employee.setCalc(10);
		employee.setDoj(new Date());
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(employee);
		//session.update(arg0);
		//session.delete(arg0);
		
		employee.setSalary(employee.getSalary()+100);
		employee.setAtt(false);
		trans.commit();
		session.close();
		System.out.println("Record Added...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUDApp obj = new CRUDApp();
		//obj.add();
		obj.search(1002);
	}

}
