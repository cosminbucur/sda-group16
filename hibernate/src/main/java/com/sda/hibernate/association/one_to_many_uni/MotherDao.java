package com.sda.hibernate.association.one_to_many_uni;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MotherDao {

    public void create(Mother owner) {
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

    public Mother findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Mother owner = session.find(Mother.class, id);
            return owner;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
