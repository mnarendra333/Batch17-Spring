package com.pragim.batch17;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Traveller {
	
	
	
	public static void main(String[] args) {
		
		
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("D:\\batch17\\Spring_ws\\DependencyInjection\\src\\myxmls\\applicationContext.xml");
		Vehicle obj = (Vehicle)ctx.getBean("id1");
		obj.start();
		obj.getVehicleInfo();
		
	}

}
