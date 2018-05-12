package com.brainmentors.apps.springbasics;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="producerHelper")
public class ProducerHelper {

	@Autowired
	@Qualifier("producer")
	IProducer producer;
	public int getProducerResult(){
		//Map map   ;
		//map.put("", "");
		return producer.add(100, 200);
	}
	public void show(){
		System.out.println("I am a Helper Show...");
	}
}
