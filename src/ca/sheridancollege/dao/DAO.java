package ca.sheridancollege.dao;

import org.hibernate.*;
import org.hibernate.cfg.*;

import ca.sheridancollege.beans.Person;

public class DAO {
	
	//Database or data Access Object. 
	//Creating sql from config file and then will call from servlet
	SessionFactory sessionFactory = new Configuration()
			.configure("ca/sheridancollege/config/hibernate.cfg.xml")
			.buildSessionFactory();
	
	public void addPerson(String name, String number, String email){
		
		//open session
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Person person = new Person();
		//setting information of the person 
		//which will come from the contact form 
		person.setName(name);
		person.setNumber(number);
		person.setEmail(email);
		//saving person object in session
		session.save(person);
		session.getTransaction().commit();
		session.close();
		System.out.println("Contact added");
		
	}
}
