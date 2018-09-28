package com.pictures.models;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadAllImages {
 	public List<Image> AllImages;

	public ReadAllImages() {
		
				SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(Image.class)
				.buildSessionFactory();
				
		Session session = factory.getCurrentSession();
		
	    try
	    {
	    	session.beginTransaction();
	    	//'from Image'.. Image is class name, not table name
	    	List<Image> Images = session.createQuery("from Image").getResultList();
	        
	        
	        for(Image img : Images) {
	        	System.out.println("img "+img.getImageUrl());
	        }
	        
	        this.AllImages = Images;
	        session.getTransaction().commit();
	 
	    } catch (Exception e) {
	    	System.out.println(e);
	    }
	    finally {
	    	factory.close();
	    }
	}



}
