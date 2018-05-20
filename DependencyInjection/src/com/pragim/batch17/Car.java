package com.pragim.batch17;

public class Car implements Vehicle {

	
	private VehicleInfoService infoService;
	
	
	public Car(VehicleInfoService infoService){
		this.infoService = infoService;
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("going by Car");

	}

	@Override
	public void getVehicleInfo() {
		// TODO Auto-generated method stub
		infoService.getVehicleInfo();
	}

}
