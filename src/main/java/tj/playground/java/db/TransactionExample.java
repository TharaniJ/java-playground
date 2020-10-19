package tj.playground.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionExample {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=1234");

            if (connection != null) {
                System.out.println("Connection Successful!");
            } else {
                throw new RuntimeException("DB connection creation failed");
            }

            connection.setAutoCommit(false);


            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            int rowCount = statement.executeUpdate("UPDATE `classicmodels`.`customer` SET `state` = 'NY' " +
                    "WHERE `customerNumber` = 103");

//            if (rowCount >= 0) {
//                System.out.println("Error generated");
//                throw new RuntimeException("This is a dummy exception");
//            }

            connection.commit();
            System.out.println("Committing transaction");

            System.out.println("Updated state for customer 103");
        } catch (Exception e) {
            // Rolling back transaction
            try {
                connection.rollback();
                System.out.println("Rolling back transaction");
            } catch (Exception ex) {
                e.printStackTrace();
            }

            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
