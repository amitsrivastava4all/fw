package com.brainmentors.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="account")
public class Account {
	//@XmlElement(name="accno")
	private int accountNumber;
	private double balance;
	private String type;
	public Account(){}
	public Account(int accountNumber, double balance, String type){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
