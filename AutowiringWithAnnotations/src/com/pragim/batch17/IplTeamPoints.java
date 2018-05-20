package com.pragim.batch17;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class IplTeamPoints {
	
	static Map<String, Integer> map = null;
	static{
		map = new HashMap<String, Integer>();
		map.put("SRH", 10);
		map.put("MI", 6);
		map.put("DD", 2);
		
		map.put("RR", 5);
		map.put("KXIP", 6);
		map.put("CSK", 8);
	}
	
	public int getPoints(String team){
		
		return map.get(team);
	}

}
