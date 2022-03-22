package com.git.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.git.hibernate.dem.entity.Employee;

public class CreateEmployeeDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		session.save(new Employee("Mohamed","Slimane","Confidential"));
		session.save(new Employee("Hafsa","Arabbate","NTT DATA"));
		session.save(new Employee("Ayoub","EL YOUSSOUFI","NTT DATA"));
		
		session.getTransaction().commit();
		
	}

}
