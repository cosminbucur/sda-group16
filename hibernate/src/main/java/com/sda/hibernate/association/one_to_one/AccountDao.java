package com.sda.hibernate.association.one_to_one;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountDao {

    public void create(Account account) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(account);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Account findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Account account = session.find(Account.class, id);
            return account;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
