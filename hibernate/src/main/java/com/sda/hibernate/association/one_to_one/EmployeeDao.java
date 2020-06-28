package com.sda.hibernate.association.one_to_one;

import com.sda.hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDao {

    public void create(Employee employee) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Employee findById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Employee employee = session.find(Employee.class, id);
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
