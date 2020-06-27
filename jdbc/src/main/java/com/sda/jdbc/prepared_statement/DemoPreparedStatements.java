package com.sda.jdbc.prepared_statement;

public class DemoPreparedStatements {

    public static void main(String[] args) {
        PreparedStatements preparedStatements = new PreparedStatements();
        preparedStatements.insertOperation("Andreea", "andreea@gmail.com", "Romania");
        preparedStatements.queryOperation();
        preparedStatements.updateOperation(1, "Alex", "alex@gmail.com", "Anglia");
        preparedStatements.queryOperation();
        preparedStatements.deleteOperation(1);
        preparedStatements.queryOperation();
    }
}
