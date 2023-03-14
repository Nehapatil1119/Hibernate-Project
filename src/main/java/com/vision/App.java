 package com.vision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started....." );
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
       //creating student
        Student st=new Student();
        st.setId(105);
        st.setName("Akshay");
        st.setCity("Vaijapur");
        System.out.println(st);
        
        //creating object of address class
        Address ad=new Address();
        ad.setStreet("street6");
        ad.setCity("Vaijapur");
        ad.setOpen(true);
        ad.setAddDate(new Date());
        ad.setX(3243.34);
        
        //reading image
        
        FileInputStream fis=new FileInputStream("src/main/java/Img.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session=factory.openSession();
      
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("Done....");
        //System.out.println(factory);
        // System.out.println(factory.isClosed());
        factory.close();
    }
}
