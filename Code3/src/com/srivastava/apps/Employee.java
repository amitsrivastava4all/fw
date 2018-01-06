package com.srivastava.apps;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;
@Entity
@Table(name="emp_mastern")
public class Employee {
	@TableGenerator(
		    name="myempgen",
		    table="EMPGEN_TABLE",
		    pkColumnName = "myid",
		    valueColumnName = "next",
		    pkColumnValue="course",
		    allocationSize=1
		    
		)
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE , generator="myempgen")
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
	@ElementCollection
	@JoinTable(name="Emp_Address_Mapping",joinColumns=@JoinColumn(name="emp_id"))

	private List<Address> addressList = new ArrayList<>();
	
	
	
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	@Embedded
	//@EmbeddedId
	private Address address;
	
	@Embedded
	@AttributeOverrides({

        @AttributeOverride(name="city", column=@Column(name="officecity")),

        @AttributeOverride(name="state", column=@Column(name="officestate")),

        @AttributeOverride(name="pincode", column=@Column(name="officepincode"))

        

    })
	private Address add;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int eid) {
		this.id = eid;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Employee(){
		
	}
	public Employee(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = new Date();
		this.att = true;
				
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
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
		return "Employee [id=" +id + ", name=" + name + ", salary=" + salary + ", att=" + att + ", doj=" + doj
				+ ", bonus=" + bonus + ", address=" + address + "]";
	}
	
	
	
	

}
