package com.sda.hibernate.association.many_to_many;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PostDao {

    public void create(Post owner) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(owner);
            transaction.commit();
            session.close();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Post findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Post owner = session.find(Post.class, id);
            return owner;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
