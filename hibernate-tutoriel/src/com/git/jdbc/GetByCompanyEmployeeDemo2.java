package com.git.jdbc;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.git.hibernate.dem.entity.Employee;

public class GetByCompanyEmployeeDemo2 {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		List<Employee> employees = session.createQuery("from Employee e where e.compnay = 'NTT DATA'").getResultList();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		session.getTransaction().commit();
		
	}

}
