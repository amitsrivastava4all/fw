package com.srivastava.springbasicexamples;

public class B implements IB{
	public int x , y;
	public String z;
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("B show..."+x+y+z);
	}

}
