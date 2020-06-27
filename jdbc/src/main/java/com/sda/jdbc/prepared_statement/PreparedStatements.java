package com.sda.jdbc.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class PreparedStatements {

    // TODO: extract constants in a yml properties file
    private static final Logger logger = Logger.getLogger(PreparedStatement.class.getName());
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_tutorial?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // insert
    public void insertOperation(String name, String email, String country) {
        String sql = "INSERT INTO user(name, email, country) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, country);
            logger.info("statement created " + preparedStatement);
            int result = preparedStatement.executeUpdate();
            logger.info("Insert return: " + (result == 1 ? "OK" : "ERROR"));
        } catch (SQLException e) {
            logger.severe("failed to insert");
        }
    }

    // read
    public void queryOperation() {
        String sql = "SELECT * FROM user";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet rs = preparedStatement.executeQuery()) {
            logger.info("statement created " + preparedStatement);

            while (rs.next()) {
                // save properties from results set
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                logger.info(id + ", " + name + ", " + email + ", " + country);
            }
        } catch (SQLException e) {
            logger.severe("failed to insert");
        }
    }

    // update
    public void updateOperation(int id, String name, String email, String country) {
        String sql = "UPDATE user SET name = ?, email = ?, country = ? WHERE id = " + id;

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, country);
            logger.info("statement created " + preparedStatement);
            int result = preparedStatement.executeUpdate();
            logger.info("Update return: " + (result == 1 ? "OK" : "ERROR"));
        } catch (SQLException e) {
            logger.severe("failed to insert");
        }
    }


    // delete
    public void deleteOperation(int id) {
        String sql = "DELETE FROM user WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            logger.info("statement created " + preparedStatement);
            int result = preparedStatement.executeUpdate();
            logger.info("Delete return: " + (result == 1 ? "OK" : "ERROR"));
        } catch (SQLException e) {
            logger.severe("failed to insert");
        }
    }
}
