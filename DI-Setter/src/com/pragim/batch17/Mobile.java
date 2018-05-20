package com.pragim.batch17;

public class Mobile implements ElectronicDevice {
	
	private String name;
	private String model;
	
	/*public Mobile(String name, String model){
		this.name = name;
		this.model = model;
	}*/
	
	public void setName(String name) {
		this.name = name;
	}

	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public void useDevice() {
		// TODO Auto-generated method stub
		System.out.println("using Mobile with bellow specs\n name "+name+" model "+model);

	}

	
}
