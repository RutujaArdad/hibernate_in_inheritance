package com.prowings.inheritance_jointable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testjoin_table_inheritance {
	
	public static void main(String[] args) {
		
		HDFC_Bank fc=new HDFC_Bank();
		
		fc.setBankid(1);
		fc.setBanktype("private");
		fc.setBranchname("jalna");
		fc.setIFSCcode("hd777");
		
		SBI_Bank bi=new SBI_Bank();
		
		bi.setBankid(2);
		bi.setBanktype("Goverment");
		bi.setBranchname("kp");
		bi.setIFSCcode("as999");
		
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sf=conf.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction trn=session.beginTransaction();
		
		session.save(fc);
		session.save(bi);
		
		trn.commit();
		
		session.close();

	}

}
