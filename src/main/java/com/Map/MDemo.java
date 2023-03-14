package com.Map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MDemo {
   public static void main(String[] args) {
	
	   Configuration cfg = new Configuration();
       cfg.configure();
       SessionFactory factory = cfg.buildSessionFactory();
       
       //creating question object
//       Question1 q1=new Question1();
//       q1.setQuestionId(102);
//       q1.setQuestion("What is Java? ");
//       
       //creating answer object
//       Answer1 a1=new Answer1();
//       a1.setAnswerId(344);
//       a1.setAnswer("Java is Programming Language");
//       a1.setQuestion(q1);
//       
//       Answer1 a2=new Answer1();
//       a2.setAnswerId(345);
//       a2.setAnswer("with the help of java we can create softwares");
//       a2.setQuestion(q1);
//       
//       Answer1 a3=new Answer1();
//       a3.setAnswerId(366);
//       a3.setAnswer("java has different type of frameworks");
//       a3.setQuestion(q1);
//       
//       List<Answer1> list=new ArrayList();
//       list.add(a1);
//       list.add(a2);
//       list.add(a3);
//       q1.setAnswers(list);
       
       //session
       Session s=factory.openSession();
       
       Transaction tx=s.beginTransaction();
       
       //save
//       s.save(q1);
//       s.save(a1);
//       s.save(a2);
//       s.save(a3);
       
       tx.commit();
       
       
//       //fetching
      Question1 q =(Question1) s.get(Question1.class, 101);
      Answer1 a=(Answer1) s.get(Answer1.class, 344);
      
      
      
      System.out.println(q.getQuestionId());
      System.out.println(q.getQuestion());
      System.out.println(a.getAnswer());
      //Lazy loading
      System.out.println(q.getAnswers().size());
       
      s.close();
       factory.close();
}
}
