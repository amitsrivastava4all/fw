package com.srivastava.relationship;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
     


	public void add()
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		Employee ram = new Employee();
		ram.setName("ABCD");
		ram.setSal(90909);
		Collection<Dept> deptList = new ArrayList<Dept>();
//		Dept dept = new Dept();
//		dept.setDeptName("IT");
//		dept.emp = ram;
//		
//		Dept dept2 = new Dept();
//		dept2.emp= ram;
//		dept2.setDeptName("Training");
		
		
		
		Dept d = session.get(Dept.class, 18);
		deptList.add(d);
		
		Dept d2 = session.get(Dept.class, 19);
		deptList.add(d2);
		ram.setDept(deptList);
		session.save(ram);  // entity (record)
		System.out.println(ram);
		//session.saveOrUpdate(d);
		//session.saveOrUpdate(d2);
		
		transaction.commit();
		session.close();

	}
	public void find(int id)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		//transaction.begin();
		//Employee emp = em.find( Employee.class,id);
		Employee emp = (Employee)session.get(Employee.class, id);
		if(emp!=null){
			System.out.println("Emp Object "+emp);
		}
		else
		{
			System.out.println("Not Found.......");
		}
		//transaction.commit();
		session.close();
	}
	
}
