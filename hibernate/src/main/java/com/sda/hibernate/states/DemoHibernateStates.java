package com.sda.hibernate.states;

import com.sda.hibernate.config.HibernateUtil;
import com.sda.hibernate.crud.Person;
import com.sda.hibernate.crud.PersonDao;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DemoHibernateStates {

    public static void main(String[] args) {
        // transient object state
        Person person = new Person();
        person.setFirstName("jon");
        person.setLastName("snow");
        person.setEmail("jonsnow@gmail.com");
        person.setCountry("westeros");
        System.out.println(person);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();

        session.save(person);
        // persistent object state
        t.commit();
        // persisted in db

        session.close();
        // detached object state

        PersonDao dao = new PersonDao();
        Person persistedPerson = dao.findById(1L);
        System.out.println(persistedPerson);
    }
}
