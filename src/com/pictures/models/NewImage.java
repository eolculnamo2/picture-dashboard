package com.pictures.models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewImage {
	public NewImage(String name, String description, String imageUrl, String creator) {
				SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Image.class)
				.buildSessionFactory();
				
				Session session = factory.getCurrentSession();
				
				try {
					Image newImage = new Image(name, description, imageUrl, creator);
					session.beginTransaction();
					session.save(newImage);
					session.getTransaction().commit();
					System.out.println("New Image Saved"+newImage);
				}
				finally {
					factory.close();
				}
	}
}
