package com.sda.hibernate.association.one_to_many_uni_join;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FatherDao {

    public void create(Father owner) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(owner);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Father findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Father owner = session.find(Father.class, id);
            return owner;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
