package com.sda.hibernate.association.one_to_many_bi;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ChildDao {

    public void create(Child child) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(child);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Child findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Child child = session.find(Child.class, id);
            return child;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
