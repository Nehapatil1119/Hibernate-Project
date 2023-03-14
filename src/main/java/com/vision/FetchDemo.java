package com.vision;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
   public static void main(String[] args) {
	//get, load
	   Configuration cfg = new 	Configuration();
	   cfg.configure("hibernate.cfg.xml");
	   SessionFactory factory=cfg.buildSessionFactory();
	   Session session=factory.openSession();
	   
	   //get student:101
	   Student student=(Student)session.get(Student.class, 105);
	   Student student1=(Student)session.get(Student.class, 105);
	   
	   System.out.println(student.getName());
	   System.out.println(student1.getName());
	   
	   //load student
//	   Student student=(Student)session.load(Student.class, 105);
//	   System.out.println(student);
	   
	  // Address ad=(Address)session.get(Address.class, 3);
	   //System.out.println(ad);
	  // System.out.println(ad.getCity()+" : "+ad.getStreet());
	   
	  // Address ad1=(Address)session.get(Address.class, 3);
	   //System.out.println(ad1);
	  // System.out.println(ad1.getCity()+" : "+ad1.getStreet());
	   
	   session.close();
	   factory.close();
}
}
