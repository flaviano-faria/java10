package br.com.java10.immutablecollections.exec;

import br.com.java10.immutablecollections.interfaces.port.IServicePort;
import br.com.java10.immutablecollections.service.ServiceImpl;

public class App {

	public static void main(String[] args) throws Exception {
		
		IServicePort service = new ServiceImpl();
		//service.addPermission();

		ServiceImpl subService = new ServiceImpl();
		subService.getIntegerList();

		//subService.getCopiedList();
		                         	
		//subService.getNullPermission();
	}
}