package org.bridgelabz.hibernate;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {
	private static SessionFactory factory;
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(Bag.class);
		 SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();  
		Transaction t=session.beginTransaction();    
		
		Book b1=new Book();
		b1.setName("telugu");
		b1.setAuthor("vemana");
			
		Book b2=new Book();
		b2.setName("hindi");
		b2.setAuthor("kishore");
		
		Book b3=new Book();
		b3.setName("english");
		b3.setAuthor("british");
		
		Book b4=new Book();
		b4.setName("sanskrit");
		b4.setAuthor("matatis");
		
		ArrayList<Book> list1=new ArrayList<Book>();    
	    list1.add(b1);    
	    list1.add(b2);    
	    
	    ArrayList<Book> list2=new ArrayList<Book>();    
	    list2.add(b3);    
	    list2.add(b4);    
	    
	    Bag bag1=new Bag();
	    bag1.setName("first");
	    bag1.setBooks(list1);
	    
	    Bag bag2=new Bag();
	    bag2.setName("second");
	    bag2.setBooks(list2);

	    session.persist(bag1);    
	    session.persist(bag2);
	    
	    t.commit();    
	    session.close();  
	}
}
