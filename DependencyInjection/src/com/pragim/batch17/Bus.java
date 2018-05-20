package com.pragim.batch17;

public class Bus implements Vehicle {

	
	private VehicleInfoService infoSertvice;
	
	public Bus(VehicleInfoService infoSertvice){
		this.infoSertvice = infoSertvice;
	}
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("going by Bus!!");

	}


	@Override
	public void getVehicleInfo() {
		// TODO Auto-generated method stub
		infoSertvice.getVehicleInfo();
	}

}
