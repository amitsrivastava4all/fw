package com.brainmentors;

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
	@Column(name="ename",length=50,unique=true,nullable=false)
	private String name;
	@Column(name="esal",precision=4,scale=5)
	private double salary;
	@Type(type="yes_no")
	private boolean att;
	@Temporal(TemporalType.TIMESTAMP)
	private Date doj;
	@Transient
	private int calc;
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
	public int getCalc() {
		return calc;
	}
	public void setCalc(int calc) {
		this.calc = calc;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", att=" + att + ", doj=" + doj
				+ ", calc=" + calc + "]";
	}
	
}
