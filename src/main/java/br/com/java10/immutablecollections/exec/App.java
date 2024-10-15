package br.com.java10.immutablecollections.exec;

import br.com.java10.immutablecollections.interfaces.port.IServicePort;
import br.com.java10.immutablecollections.service.ServiceImpl;

public class App {

	public static void main(String[] args) {
		
		IServicePort service = new ServiceImpl();
		service.addPermission();
	}
}
