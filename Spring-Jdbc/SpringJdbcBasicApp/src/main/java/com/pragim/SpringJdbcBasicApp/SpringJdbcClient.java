package com.pragim.SpringJdbcBasicApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
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
		
		//obj.updateEmployee("chenni", 101);
		//obj.deleteEmp(101);
		/*List<Employee> listOfEmp = obj.getAllEmployeesWithListOfPojos();
		for (Employee employee : listOfEmp) {
			System.out.println(employee);
		}*/
		
		
		obj.getEmployeeThroughRSExtractor();
		
	}


	private void getEmployeeThroughRSExtractor() {
		// TODO Auto-generated method stub
		
		List<Employee> list =  jt.query("select * from employee", new ResultSetExtractor<List<Employee>>() {

			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				List<Employee> list = new ArrayList<Employee>();
				for (; rs.next();) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
				return list;
			}
			
		});
		
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
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
		
		int count = jt.update("update employee set addr=? where empid=?",new Object[]{addr,id});
		System.out.println(count+" rows updated");
	}
	
	public void deleteEmp(int empId){
		
		int count = jt.update("delete from employee where empid=?", empId);
		System.out.println(count+" rows updated");
		 
	}
	
	
	public List<Employee> getAllEmployeesWithListOfPojos(){
		
		return jt.query("select * from employee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				// TODO Auto-generated method stub
				Employee obj = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
				return obj;
			}
		});
		
	}
	
	
	
	

}
