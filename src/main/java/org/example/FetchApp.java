package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;

public class FetchApp {
    public static void main(String[] args) {
        SessionFactory factory =HibernateUtil.getSessionFactory();
       Session session= factory.openSession();
      // Transaction transaction =session.beginTransaction();
      Employee employee= session.load(Employee.class,10);// if the data is not their it will show null
        //if we use load method it will show object not found exception
        System.out.println(employee);
    }
}
