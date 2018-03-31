package com.srivastava.basics;

public class Employee {
private int id;
private String name;
private double salary;
public Employee(){
	System.out.println("Default Cons Call");
}
public Employee(int id, String name, double salary){
	System.out.println("Param Cons Call");
	this.id = id;
	this.name=name;
	this.salary=salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	System.out.println("Salary Setter Called...");
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
