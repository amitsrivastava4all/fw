package com.srivastava.springbasicexamples;

import org.springframework.stereotype.Service;

@Service("x")
public class X implements IB{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("X Show");
	}

}
