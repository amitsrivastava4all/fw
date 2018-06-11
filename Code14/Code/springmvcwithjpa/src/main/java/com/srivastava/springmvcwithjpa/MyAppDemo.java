package com.srivastava.springmvcwithjpa;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class A
{
	static void show(int i ) {
		System.out.println("A Show.... "+i);
	}
}

interface YY{
	void display();
	void print();
}
class Y1 implements YY{
	public void display() {
		System.out.println("Y1 Disp...");
	}
	public void print() {
		System.out.println("Print...");
	}
	
}
interface Calc{
	int calculate(int x, int y);
}
class D implements Calc{

	@Override
	public int calculate(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}
	
}

//@SpringBootApplication
public class MyAppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		Calc e = d::calculate;
		System.out.println(e.calculate(1, 2));
		Calc c = (x,y)->x + y;
		System.out.println(c.calculate(1000, 2000));
		Calc c2 = new D();
		System.out.println(c2.calculate(10, 3));
		//SpringApplication.run(MyAppDemo.class,args);
		Y1 y = new Y1();
		//YY obj = y::display;
		//System.out.println(obj);
		//obj.display();
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.forEach(A::show);
		
		
	}

}
