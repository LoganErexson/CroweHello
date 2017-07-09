package helloService;

public class HelloFactory {
	public static HelloService getHelloService(String output){
		switch(output){
			case "console": 
				return new HelloService(System.out);
			default:
				return null;
		}
	}
}
