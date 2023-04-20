package org.example;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       SessionFactory sf= HibernateUtil.getSessionFactory();
        System.out.println(sf);
    }
}
