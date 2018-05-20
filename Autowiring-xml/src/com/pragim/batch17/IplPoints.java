package com.pragim.batch17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IplPoints {
	
	
	IplTeamPoints iplTeamPoints;
	
	
	
	public void setIplTeamPoints(IplTeamPoints iplTeamPoints){
		this.iplTeamPoints  =iplTeamPoints;
	}
	
	public IplPoints(IplTeamPoints iplTeamPoints){
		this.iplTeamPoints = iplTeamPoints;
	}
	
	
	public void getIPLPoints(String teamName){
		int points = iplTeamPoints.getPoints(teamName);
		System.out.println(points);
		
	}
	
	public static void main(String[] args) {
		
		String team = args[0];
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ipl.xml");
		IplPoints obj = (IplPoints)ctx.getBean("id1");
		obj.getIPLPoints(team);
		
	}
	

}
