package com.git.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.git.hibernate.dem.entity.Employee;

public class GetByIdEmployeeDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Employee student = session.get(Employee.class, 1);
		System.out.println(student);
		
		session.getTransaction().commit();
		
	}

}
