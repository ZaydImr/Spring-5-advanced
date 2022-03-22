package com.git.jdbc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.git.hibernate.dem.entity.Student;

public class CreateStudentDemo {
	
	public static void main(String[] args) {
		
		// create sessionFactory
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		// create session
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			// create a student object
			Student student = new Student("Mohamed","Sliman","mohamed.sliman@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student object
			session.save(student);
			
			// commit transaction
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
