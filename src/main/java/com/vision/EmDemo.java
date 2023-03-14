package com.vision;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
    	 Configuration cfg = new Configuration();
         cfg.configure();
         SessionFactory factory = cfg.buildSessionFactory();
         
         Student_Details s1=new Student_Details();
         s1.setSid(1003);
         s1.setName("Sparshika Patil");
         
         Certificate c1=new Certificate();
         c1.setCourse("Tester");
         c1.setDuration("4.5 months");
         s1.setCerti(c1);
         
         Student_Details s2=new Student_Details();
         s2.setSid(1004);
         s2.setName("Shanaya Wani");
         
         Certificate c2=new Certificate();
         c2.setCourse("Android");
         c2.setDuration("2.5 months");
         s2.setCerti(c2);
         
         Session s=factory.openSession();
         Transaction tx=s.beginTransaction();
         
         //objects save:
         s.save(s1);
         s.save(s2);
         
         tx.commit();
         s.close();
         factory.close();
         
	}
	
	
}
