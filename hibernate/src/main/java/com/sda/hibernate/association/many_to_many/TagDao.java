package com.sda.hibernate.association.many_to_many;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TagDao {

    public void create(Tag tag) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(tag);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Tag findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Tag tag = session.find(Tag.class, id);
            return tag;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
