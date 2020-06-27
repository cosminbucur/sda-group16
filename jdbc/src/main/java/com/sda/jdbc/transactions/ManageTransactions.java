package com.sda.jdbc.transactions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

public class ManageTransactions {

    private static final Logger logger = Logger.getLogger(ManageTransactions.class.getName());
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_tutorial?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // insert
    public void insertOperation() {
        String insertUserSql = "INSERT INTO user(name, email, country) VALUES (?, ?, ?)";
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(insertUserSql);

            // go to manual mode
            connection.setAutoCommit(false);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                // read input from user
                System.out.println("enter name: ");
                String name = br.readLine();

                System.out.println("enter email: ");
                String email = br.readLine();

                System.out.println("enter country: ");
                String country = br.readLine();

                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, country);

                // execute statement
                preparedStatement.execute();

                System.out.println("commit / rollback");
                // read input from user
                String transactionOperation = br.readLine();

                if (transactionOperation.equals("commit")) {
                    // commit
                    connection.commit();
                    logger.info("record successfully saved");
                }
                if (transactionOperation.equals("rollback")) {
                    // rollback
                    connection.rollback();
                    logger.info("record rolled back");
                }

                // read input from user
                System.out.println("want to add more records? y/n");
                String answer = br.readLine();
                if (answer.equals("n")) {
                    break;
                }
            }
            // final commit
            connection.commit();

            // before closing connection commit() is called
            connection.close();
            logger.info("connection closed");
        } catch (SQLException | IOException e) {
            logger.severe("failed to insert");
        }
    }
}
