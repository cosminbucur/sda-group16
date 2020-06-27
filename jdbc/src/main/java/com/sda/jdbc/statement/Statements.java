package com.sda.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class Statements {

    private static final Logger logger = Logger.getLogger(Statements.class.getName());
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_tutorial?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // CRUD

    // insert - command
    public void insertOperation(String name, String email, String country) {
        try {
            // create connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            logger.info("connection created" + connection);

            // create statement
            Statement statement = connection.createStatement();
            logger.info("statement created" + statement);

            String insertUserSql = "INSERT user(name, email, country) VALUES"
                + "('" + name + "','" + email + "','" + country + "')";
            logger.info("execute update: " + insertUserSql);

            // execute
            // INSERT user(name, email, country) VALUES
            // ('?', '?', '?')
            statement.executeUpdate(insertUserSql);

            // close connection
            connection.close();
            logger.info("connection closed");
        } catch (SQLException e) {
            logger.severe("failed to insert");
        }
    }

    // select - query
    public void queryOperation() {
        try {
            // create connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            logger.info("connection created" + connection);

            // create statement
            Statement statement = connection.createStatement();
            logger.info("statement created" + statement);

            String selectUsersSql = "SELECT id, name, email, country FROM user";
            logger.info("execute select: " + selectUsersSql);

            // execute
            ResultSet rs = statement.executeQuery(selectUsersSql);

            // iterate result set
            while (rs.next()) {
                // save properties from results set
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                logger.info(id + ", " + name + ", " + email + ", " + country);
            }

            // close connection
            connection.close();
            logger.info("connection closed");
        } catch (SQLException e) {
            logger.severe("failed to query");
        }
    }

    public void updateOperation(int id, String name, String email, String country) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            statement.executeUpdate("UPDATE user SET name = '" + name + "', " +
                "email = '" + email + "', country = '" + country + "' WHERE id = " + id);
        } catch (SQLException e) {
            // Handle errors for JDBC
            logger.severe("failed to update");
        } catch (Exception e) {
            // Handle errors for Class.forName
            logger.severe("something wrong happened");
        } finally {
            //finally block used to close resources
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
                logger.severe("failed to close statement");
            } // do nothing

            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                logger.severe("failed to close connection");
            }
        }
    }

    public void deleteOperation(int id) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()) {
            if (statement != null) {
                // DELETE
                int result = statement.executeUpdate("DELETE FROM user WHERE id = " + id);
                System.out.println("Delete return: " + (result == 1 ? "OK" : "ERROR"));
            }
        } catch (SQLException e) {
            logger.severe("failed to delete");
        }
    }
}

