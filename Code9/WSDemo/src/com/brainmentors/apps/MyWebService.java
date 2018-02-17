package com.brainmentors.apps;

import javax.jws.WebResult;
import javax.jws.WebService;

import com.brainmentors.dto.Account;
import com.brainmentors.dto.Customer;

@WebService
public class MyWebService {
public int add(int x, int y){
	return x + y;
}

@WebResult(header = true, name = "Account", targetNamespace = "")
public Account getCustomerAccountInfo(Customer customer){
	if(customer.getId()==1001){
		Account account = new Account(1,9999,"SavingAccount");
		return account;
	}
	else{
		Account account = new Account(1,9999,"SavingAccount");
		return account;
	}
}
}
