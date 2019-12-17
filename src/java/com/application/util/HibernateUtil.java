/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author kartika
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static final SessionFactory sessionFact;

    static {
        try {
            sessionFact = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.out.println("SessionFactory createion failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    public static final ThreadLocal session = new ThreadLocal();

    public static Session currentSession() throws HibernateException {
        Session sess = (Session) session.get();
        if (sess == null) {
            sess = sessionFact.openSession();
            session.set(sess);
        }
        return sess;
    }

    public static void SessionClose() throws Exception {
        Session s = (Session) session.get();
        if (s != null) {
            s.close();
        }
        session.set(null);
    }
}
