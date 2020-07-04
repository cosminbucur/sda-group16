package com.sda.hibernate.config;

import com.sda.hibernate.queries.hql.Stock;
import com.sda.hibernate.queries.native_query.Trader;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {

    private static SessionFactory sessionFactory = buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }

    private static SessionFactory buildSessionFactory() {
        // load up the configuration using the hibernate.cfg.xml
        Configuration configuration = createConfig();

        // build the registry using the properties in the configuration
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(configuration.getProperties()).build();

        // build the session factory from the service registry
        return configuration.buildSessionFactory(serviceRegistry);
    }

    private static Configuration createConfig() {
        Configuration configuration = new Configuration();

        // hibernate settings equivalent to hibernate.cfg.xml's properties
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate?serverTimezone=UTC");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "Rootpass3#");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, "create-drop");
        configuration.setProperties(settings);

        // add annotated classes

        // crud
//        configuration.addAnnotatedClass(Person.class);

        // one to one
//        configuration.addAnnotatedClass(Employee.class);
//        configuration.addAnnotatedClass(Account.class);

        // unidirectional one to many
//        configuration.addAnnotatedClass(Mother.class);
//        configuration.addAnnotatedClass(Daughter.class);
//
//        // unidirectional one to many join column
//        configuration.addAnnotatedClass(Father.class);
//        configuration.addAnnotatedClass(Son.class);

        // unidirectional one to many join column
//        configuration.addAnnotatedClass(Parent.class);
//        configuration.addAnnotatedClass(Child.class);

        // many to many
//        configuration.addAnnotatedClass(Post.class);
//        configuration.addAnnotatedClass(Post.class);

        // hql
        configuration.addAnnotatedClass(Stock.class);
        configuration.addAnnotatedClass(Trader.class);

        return configuration;
    }
}
