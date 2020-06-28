package com.sda.hibernate.association.one_to_many_uni;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DaughterDao {

    public void create(Daughter daughter) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(daughter);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Daughter findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Daughter daughter = session.find(Daughter.class, id);
            return daughter;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
