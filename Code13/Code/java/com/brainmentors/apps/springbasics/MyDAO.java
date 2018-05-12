package com.brainmentors.apps.springbasics;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Repository;

@Repository
public class MyDAO {

	@PostConstruct
	public void init(){
		System.out.println("init call................");
	}
	
	@PreDestroy
	public void end(){
		System.out.println("Destroy end call.........");
	}
	
	public void add(){
		System.out.println("Add Call");
	}
	public void delete(){
		System.out.println("Delete Call....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
