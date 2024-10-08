package br.com.java10.immutablecollections.exec;

import java.util.ArrayList;

import br.com.java10.immutablecollections.domain.Permission;
import br.com.java10.immutablecollections.domain.Read;
import br.com.java10.immutablecollections.domain.User;
import br.com.java10.immutablecollections.domain.Write;

public class App {

	public static void main(String[] args) {
		
		Permission permissionRead = new Read();
		ArrayList<Permission> permissions = new ArrayList<Permission>();
		permissions.add(permissionRead);
		User user = new User(permissions);
		
		Permission permissionWrite = new Write();
		user.addPermission(permissionWrite);
	}
}
