package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Instructor;
import entity.InstructorDetail;

public class BiMain {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Instructor.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		// will save details also because we have cascade.all
		InstructorDetail instructorDetail = session.get(InstructorDetail.class, 1);
		System.out.println(instructorDetail.getInstructor().getFirstName());
		session.getTransaction().commit();

	}

}
