package main;

import java.util.ArrayList;
import java.util.List;

import helloService.HelloFactory;
import service.IService;
import service.ServiceManager;

public class HelloApp {

	public static void main(String[] args) {
		List<IService> services = new ArrayList<>();
		services.add(HelloFactory.getHelloService("console"));
		
		ServiceManager manager = new ServiceManager(services);
		manager.run();

	}

}
