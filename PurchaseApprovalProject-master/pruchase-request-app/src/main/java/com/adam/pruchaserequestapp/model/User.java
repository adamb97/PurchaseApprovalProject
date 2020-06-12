package com.adam.pruchaserequestapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
 
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 
 @Column(name = "email")
 private String email;
 
 @Column(name = "FirstName")
 private String firstname; 
 
 @Column(name = "LastName")
 private String lastname;
 
 @Column(name = "password")
 private String password;
 
 
 @ManyToMany(cascade=CascadeType.ALL)
 @JoinTable(name="userroles", joinColumns=@JoinColumn(name="userID"), inverseJoinColumns=@JoinColumn(name="roleID"))
 private Set<Role> roles;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public Set<Role> getRoles() {
	return roles;
}


public void setRoles(Set<Role> roles) {
	this.roles = roles;
}
 
 
}
