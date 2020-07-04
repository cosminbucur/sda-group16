package com.sda.hibernate.queries.native_query;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TraderDao {

    private static final Logger logger = Logger.getLogger(TraderDao.class.getName());

    private Session session;
    private Transaction tx;

    public void create(Trader trader) {
        try {
            startOperation();
            session.save(trader);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("error creating trader " + trader);
        }
    }

    // find all with native query
    public List findAllWithNativeQuery() {
        String sql = "select * from trader";
        List result = new ArrayList();

        try {
            startOperation();

            // query using native SQL
            NativeQuery query = session.createNativeQuery(sql);
            result = query.getResultList();

            tx.commit();
            session.close();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("error executing sql " + sql);
        }
        return result;
    }

    // named query with parameter
    public List findAllByNameWithNativeQuery(String name) {
        List result = new ArrayList();

        try {
            startOperation();

            // query using native sql
            NativeQuery query = session.createNativeQuery("findTraderByNameNativeSQL", Trader.class);
            query.setParameter("name", name);

            result = query.getResultList();

            tx.commit();
            session.close();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            logger.severe("error executing named query: findTraderByNameNativeSQL");
        }
        return result;
    }

    private void startOperation() {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
}
