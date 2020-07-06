package com.sda.hibernate.association.many_to_many;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PostDao {

    public void create(Post owner) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(owner);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public Post findById(Long id) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Post owner = session.find(Post.class, id);
            return owner;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
