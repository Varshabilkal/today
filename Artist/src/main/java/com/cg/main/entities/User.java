package com.cg.main.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})      
@SequenceGenerator(name="seq",sequenceName = "seq", initialValue= 100000, allocationSize=10112000)
public class User {
@Id 
private int user_id;
private String user_password;
private int created_by;
private String created_on;
private int updated_by;
private String updated_on;
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public int getCreated_by() {
	return created_by;
}
public void setCreated_by(int created_by) {
	this.created_by = created_by;
}

public int getUpdated_by() {
	return updated_by;
}
public void setUpdated_by(int updated_by) {
	this.updated_by = updated_by;
}


public String getCreated_on() {
	return created_on;
}
public void setCreated_on(String created_on) {
	this.created_on = created_on;
}
public String getUpdated_on() {
	return updated_on;
}
public void setUpdated_on(String updated_on) {
	this.updated_on = updated_on;
}

}
