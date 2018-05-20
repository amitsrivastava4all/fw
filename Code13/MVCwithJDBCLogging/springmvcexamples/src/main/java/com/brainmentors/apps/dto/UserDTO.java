package com.brainmentors.apps.dto;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {
	private int id;
	private String userid;
	private String password;
	public UserDTO(){
		
	}
	public UserDTO(String userid, String password){
		this.userid = userid;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", password=" + password + "]";
	}

	
}
