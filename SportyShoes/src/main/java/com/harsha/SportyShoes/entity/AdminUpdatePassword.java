package com.harsha.SportyShoes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class AdminUpdatePassword {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String username;
    private String password;
    private String newPassword;
    
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public AdminUpdatePassword(Long id, String username, String password, String newPassword) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.newPassword = newPassword;
	}
	public AdminUpdatePassword() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminUpdatePassword(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", password=" + password + ", newPassword=" + newPassword
				+ "]";
	}
    
	
	
}