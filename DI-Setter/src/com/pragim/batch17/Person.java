package com.pragim.batch17;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Person {
	
	private ElectronicDevice device;
	
	
	/*public Person(ElectronicDevice device){
		this.device = device;
	}*/
	
	
	public void setDevice(ElectronicDevice device){
		this.device = device;
	}
	
	public void doWork(){
		device.useDevice();
	}
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person)ctx.getBean("person");
		person.doWork();
		
		
	}
	
	

}
