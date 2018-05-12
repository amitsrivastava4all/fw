package com.brainmentors.apps.springbasics;

import org.springframework.stereotype.Component;

@Component
public class Producer2 {
	String msg;
	Producer2(){
		msg ="Hello";
		System.out.println("Producer2 Default Cons call"+msg);
	}
	Producer2(String msg){
		this.msg  = msg;
		System.out.println("Params Call Producer2 "+this.msg);
	}

}
