package com.brainmentors.server;

public class Producer implements IProducer
{
	@Override
	public String callMe(){
		return "Call Producer";
	}
	public String dontCallMe(){
		return "Don't Call Me From outside ";
	}
}
