package org.daniel.tragent.todo_list.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Users {
	
	private long id;
	private String firstName;
	private String lastName;
	private String role;
	
	public Users() {}
	
	public Users(long id, String firstName, String lastName, String role){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
