package com.srivastava.apps;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
@Entity
@Table(name="emp_master")
public class Employee {
	@Id
	private int id;
	@Column(name="ename",length=50,nullable=false,unique=true)
	private String name;
	private double salary;
	@Type(type="yes_no")
	private boolean att;
	@Temporal(TemporalType.DATE)
	private Date doj;
	@Transient
	private double bonus = 1000;
	public Employee(){
		
	}
	public Employee(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = new Date();
		this.att = true;
				
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
		this.salary = salary;
	}
	public boolean isAtt() {
		return att;
	}
	public void setAtt(boolean att) {
		this.att = att;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", att=" + att + ", doj=" + doj
				+ ", bonus=" + bonus + "]";
	}
	
	
	

}
