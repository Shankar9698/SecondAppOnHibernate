package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student=new Student();
        student.setId(2);
        student.setFirst_name("jaya");
        student.setLast_name("krishna");
        student.setAddress("india");
       SessionFactory sf= HibernateUtil.getSessionFactory();
      Session session = sf.openSession();
     Transaction transaction = session.beginTransaction();
     session.save(student);
     transaction.commit();
     sf.close();

    }
}
