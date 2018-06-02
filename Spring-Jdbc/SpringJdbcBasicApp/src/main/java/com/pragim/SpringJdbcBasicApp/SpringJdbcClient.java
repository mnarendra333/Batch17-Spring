package com.pragim.SpringJdbcBasicApp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


public class SpringJdbcClient {
	
	private JdbcTemplate jt;
	
	
	public void setJt(JdbcTemplate jt){
		this.jt = jt;
	}
	
	
	public void getListOfEmployess(){
		
		List<Map<String, Object>> queryForList = jt.queryForList("select * from employee");
		System.out.println(queryForList);
	}
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		
		SpringJdbcClient obj = (SpringJdbcClient)ctx.getBean("springclient");
		obj.getListOfEmployess();
		//obj.insertEmployee();
		//obj.createTable();
		
		obj.updateEmployee("chenni", 101);
		
	}


	public void insertEmployee() {
		// TODO Auto-generated method stub
		
		jt.execute("insert into employee values(101,'bangl','ravi')");
		System.out.println("Done!");
		
	}
	
	public void createTable(){
		
		
		jt.execute("create table test_tab(id number(5),name varchar2(20))");
		System.out.println("Done!");
	}
	
	
	public void updateEmployee(String addr, int id){
		
		int count = jt.update("update employee set addr=? where empid=?",addr,id);
		System.out.println(count+" rows updated");
	}
	

}
