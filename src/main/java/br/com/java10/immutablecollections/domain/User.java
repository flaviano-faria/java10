package br.com.java10.immutablecollections.domain;

import java.util.Collections;
import java.util.List;

public class User {
	
	private List<Permission> permission;

	public User(List permission) {
	
		this.permission = Collections.unmodifiableList(permission);
	}
	public User() {


	}


	public void addPermission(Permission permission) {

		this.permission.add(permission);
	}

	public void printList(){
		Permission read = new Read();
		var list = List.of(1, 2, 3, 4, 5);
        list.stream().forEach(e->System.out.println(e+1));
    }

	public void printCopiedList(){
		Permission read = new Read();
		var list = List.of(1, 2, 3, 4, 5);
		var copiedList = List.copyOf(list);
		copiedList.add(2);
		copiedList.stream().forEach(e->System.out.println(e+1));
	}
}
