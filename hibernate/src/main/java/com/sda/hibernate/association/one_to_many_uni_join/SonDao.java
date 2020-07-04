package com.sda.hibernate.association.one_to_many_uni_join;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class SonDao {

    public void create(Son son) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(son);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Son findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Son son = session.find(Son.class, id);
            return son;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
