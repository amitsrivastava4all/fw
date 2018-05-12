package com.brainmentors.apps.springbasics;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component(value="producer")
public class Producer implements IProducer {

	@Override
	public int add(int x, int y) {
		
		// TODO Auto-generated method stub
		return x + y;
	}
	
}
