package com.brainmentors.server;

import java.util.ResourceBundle;

public class Factory {
	private Factory(){}
	public static IProducer getProducer(){
		ResourceBundle rb = ResourceBundle.getBundle("object");
		String className= rb.getString("classname");
		Object object=null;
		try {
			object = Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (IProducer)object;
		//return new EffectiveProducer();
	}

}
