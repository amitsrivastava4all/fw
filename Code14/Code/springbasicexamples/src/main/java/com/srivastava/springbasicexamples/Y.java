package com.srivastava.springbasicexamples;

import org.springframework.stereotype.Service;

@Service("y")
public class Y implements IB {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Y Show...");
	}

}
