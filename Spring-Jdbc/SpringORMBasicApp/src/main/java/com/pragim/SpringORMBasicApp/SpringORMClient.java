package com.pragim.SpringORMBasicApp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.pragim.SpringORMBasicApp.model.Employee;

@Component
public class SpringORMClient {
	
	
	@PersistenceContext
	private EntityManager em;

	public void persist(Employee employee) {
		em.persist(employee);
	}

	
	public List<Employee> findAll() {
		return em.createQuery("select e FROM Employee e").getResultList();
	}
	
	@Transactional
	public void saveEmp(Employee e){
		em.persist(e);
		
		
	}
	
	@Transactional
	public void deleteEmp(int id){
		
		Employee e = em.find(Employee.class, 300);
		em.remove(e);
	}
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		SpringORMClient obj = (SpringORMClient)ctx.getBean("springORMClient");
		
		
		/*Employee e = new Employee();
		e.setEmpId(300);
		e.setEmpName("Raj");
		e.setAddress("bangl");
		
		obj.saveEmp(e);*/
		
		
		List<Employee> data = obj.findAll();
		for (Employee employee : data) {
			System.out.println(employee);
		}
		
		//obj.deleteEmp(300);
		
		
	}
	
	
	

}
