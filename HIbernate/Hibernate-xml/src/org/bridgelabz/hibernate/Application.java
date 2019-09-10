package org.bridgelabz.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {
	 private static SessionFactory factory; 
	public static void main(String[] args) {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		 tx = session.beginTransaction();
		Bag b=new Bag("kishore",100);
		session.save(b);  
         tx.commit();
         factory.close();  
		session.close(); 
	}	
}
