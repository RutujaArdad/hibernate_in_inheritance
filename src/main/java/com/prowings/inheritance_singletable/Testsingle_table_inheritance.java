package com.prowings.inheritance_singletable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testsingle_table_inheritance {
	
	public static void main(String[] args) {
		
		
		Bike b=new Bike();
		b.setId(1);
		b.setName("suzukigixxer");
		b.setNoofwheels(2);
		
		Car c=new Car();
		c.setId(2);
		c.setName("thar");
		c.setNoofwheels(4);
		c.setSteeringtype("electronic");
		
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction trn=session.beginTransaction();
		
		//session.save(b);
		//session.save(c);
		
		
		Bike bike=session.get(Bike.class, 1);
		System.out.println(bike);
		
		
		trn.commit();
		session.close();
		
		
	}

}
