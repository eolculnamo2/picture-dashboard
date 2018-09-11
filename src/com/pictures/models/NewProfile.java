package com.pictures.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class NewProfile {

	public NewProfile(String name, String username, String password, String profilePicture, String email) {
		
				SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Profile.class)
				.buildSessionFactory();
				
				Session session = factory.getCurrentSession();
				
				try {
					Profile profile = new Profile(name, username, password, profilePicture, email);
					session.beginTransaction();
					session.save(profile);
					session.getTransaction().commit();
					System.out.println("New Profile Created");
				}
				finally {
					factory.close();
				}
		}
	

}
