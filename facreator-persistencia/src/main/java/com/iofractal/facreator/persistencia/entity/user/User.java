package com.iofractal.facreator.persistencia.entity.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	private String id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
//	private boolean enabled;
//	private Set<UserRole> userRole = new HashSet<UserRole>(0);

	public User() {
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


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public boolean isEnabled() {
//		return enabled;
//	}
//
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}

//	public Set<UserRole> getUserRole() {
//		return userRole;
//	}
//
//	public void setUserRole(Set<UserRole> userRole) {
//		this.userRole = userRole;
//	}



}

