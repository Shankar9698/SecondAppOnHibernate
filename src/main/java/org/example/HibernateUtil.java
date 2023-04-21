package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


import java.util.Properties;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration cfg = new Configuration(); //create conf object
            Properties properties = new Properties();// create pro object
            properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/my_db");
            properties.put(Environment.USER, "root");
            properties.put(Environment.PASS, "root");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            properties.put(Environment.SHOW_SQL,"true");
            properties.put(Environment.FORMAT_SQL,"true");

            cfg.setProperties(properties); //
            cfg.addAnnotatedClass(Student.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
            sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}