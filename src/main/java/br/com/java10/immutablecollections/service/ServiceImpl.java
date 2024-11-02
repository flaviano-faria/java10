package br.com.java10.immutablecollections.service;

import java.util.ArrayList;

import br.com.java10.immutablecollections.domain.Permission;
import br.com.java10.immutablecollections.domain.Read;
import br.com.java10.immutablecollections.domain.User;
import br.com.java10.immutablecollections.domain.Write;
import br.com.java10.immutablecollections.interfaces.port.IServicePort;

public class ServiceImpl implements IServicePort{

	@Override
	public void addPermission() {
		Permission permissionRead = new Read();
		ArrayList<Permission> permissions = new ArrayList<Permission>();
		permissions.add(permissionRead);
		User user = new User(permissions);
		
		Permission permissionWrite = new Write();
		user.addPermission(permissionWrite);
		
	}

	public void getIntegerList(){
		User user = new User();
		user.printList();
	}

	public void getCopiedList(){
		User user = new User();
		user.printCopiedList();
	}


}
