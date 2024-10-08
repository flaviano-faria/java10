package br.com.java10.immutablecollections.domain;

import java.util.Collections;
import java.util.List;

public class User {
	
	private List<Permission> permission;

	public User(List permission) {
	
		this.permission = Collections.unmodifiableList(permission);
	}
	
	public void addPermission(Permission permission) {
		this.permission.add(permission);
	}
}
