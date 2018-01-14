package com.srivastava.apps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo1 {
	static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	static void add(){
		Employee ram = new Employee(1002, "RIM", 9999); // Transient
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
		add();
		//find();
		

	}

}
