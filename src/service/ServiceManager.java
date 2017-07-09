package service;

import java.util.List;

public class ServiceManager {
	private List<IService> services;
	
	public ServiceManager(List<IService> services){
		this.services = services;
	}
	
	public List<IService> getServices(){
		return this.services;
	}
	
	public void addService(IService service){
		this.services.add(service);
	}
	
	public void run(){
		for(int i =0;i<this.services.size(); i++){
			this.services.get(i).run();
		}
	}
}
