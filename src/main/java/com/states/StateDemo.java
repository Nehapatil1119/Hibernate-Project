package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vision.Certificate;
import com.vision.Student_Details;

public class StateDemo {
   public static void main(String[] args) {
	
	   //Hibernate object states:
	   //1.Transient
	   //2.Persistent
	   //3.Detached
	   //4.Removed
	   
	   System.out.println("Example :"); 
	   
	   SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	   
	   //Student object
	    Student_Details s1=new Student_Details();
	    s1.setSid(15);
	    s1.setName("Nikhil");
	    s1.setCerti(new Certificate("Android","6.5 month"));
	   //standard05: Transient state
	   
	   Session s=f.openSession();
	   Transaction tx=s.beginTransaction();
	   s.save(s1);
	   //standard05 : Persistent state = session,database
	   
	   s1.setName("Akshay");
	   tx.commit();
	   
	   s.close();
	   //student_details : detached state 
	   
	   s1.setName("Sachin");
	   System.out.println(s1);
	   
	   
	   f.close();
}
}
