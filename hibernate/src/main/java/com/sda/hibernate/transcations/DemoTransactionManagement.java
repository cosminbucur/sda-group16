package com.sda.hibernate.transcations;

import com.sda.hibernate.config.HibernateUtil;
import com.sda.hibernate.crud.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DemoTransactionManagement {

    public static void main(String[] args) {
        // create session factory
        Session session = null;
        Transaction tx = null;
        try {
            // create session
            session = HibernateUtil.getSessionFactory().openSession();
            // create transaction
            // begin
            tx = session.beginTransaction();
            tx.setTimeout(5);

            // work
            // do something with the session
            Person person = new Person();
            person.setFirstName("alex");
            session.save(person);
            tx.commit();
        } catch (RuntimeException e) {
            // any exception thrown by hibernate is fatal
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            // clean up
            if (session != null) {
                session.close();
            }
        }

    }
}
