package helloService;

import java.io.PrintStream;

import service.IService;

public class HelloService implements IService {
	PrintStream out;
	
	public HelloService(PrintStream out){
		this.out = out;
	}
	

	@Override
	public void run() {
		this.out.println("Hello World");
	}
	
}
