package com.brainmentors.clients;

import com.brainmentors.server.Factory;
import com.brainmentors.server.IProducer;
import com.brainmentors.server.Producer;

public class Consumer {
public static void main(String[] args) {
	//IProducer p = new Producer();
	IProducer p  = Factory.getProducer();
	System.out.println(p.callMe());
	//p.dontcallme();
	
}
}
