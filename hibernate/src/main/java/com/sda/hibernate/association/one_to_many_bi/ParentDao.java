package com.sda.hibernate.association.one_to_many_bi;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ParentDao {

    public void create(Parent owner) {
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

    public Parent findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Parent owner = session.find(Parent.class, id);
            return owner;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
