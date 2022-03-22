package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Instructor;
import entity.InstructorDetail;

public class Main {
	
	public static void main(String[] args) {
		
		InstructorDetail detail = new InstructorDetail("channel","hobby");
		Instructor instructor = new Instructor("Mohamed", "Sliman", "elimrani.z@gmail.com", detail);
		
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(InstructorDetail.class)
									.addAnnotatedClass(Instructor.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		// will save details also because we have cascade.all
		session.save(instructor);
		session.getTransaction().commit();
			
		
	}

}
