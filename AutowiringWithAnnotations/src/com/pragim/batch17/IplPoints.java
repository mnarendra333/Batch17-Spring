package com.pragim.batch17;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class IplPoints {
	
	
	IplTeamPoints iplTeamPoints;
	
	@Autowired
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
		
		String team = "SRH";
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		IplPoints obj = (IplPoints)ctx.getBean("iplPoints");
		obj.getIPLPoints(team);
		
	}
	

}
