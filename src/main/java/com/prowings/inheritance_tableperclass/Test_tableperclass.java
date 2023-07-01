package com.prowings.inheritance_tableperclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_tableperclass {
	
	public static void main(String[] args) {
		
		Student st=new Student();
		st.setId(1);
		st.setName("rutu");
		st.setGreade("A+");
		st.setFee(4200);
		
		Teacher te=new Teacher();
		te.setId(2);
		te.setName("badesir");
		te.setSallary(40000);
		te.setYearofExperince(7);
		
		
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction trn=session.beginTransaction();
		
		session.save(st);
		session.save(te);
		
		trn.commit();
		session.close();
		
	}

}
