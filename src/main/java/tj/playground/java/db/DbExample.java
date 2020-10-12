package tj.playground.java.db;

import java.sql.*;

public class DbExample {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=1234");

            /*
            Using jdbc to connect MySQL
            localhost in our computer
            classic model is the data base using
            username and password of the mySQL workbench.
             */

            if (connection != null) {
                System.out.println("Connection Successful!");
            }

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("SELECT * FROM `classicmodels`.`customer`");

            //calling writeMetaData
            writeMetaData(resultSet);

            System.out.println("\nData values : ");

            int rowCounter = 0;
            while (resultSet.next()) {
                System.out.println("Customer Number : " + resultSet.getString("customerNumber")); // Uses column name
                System.out.println("Customer FirstName : " + resultSet.getString(2));
                System.out.println("Customer Last Name : " + resultSet.getString("contactLastName"));
                System.out.println();

                rowCounter++;

                if (rowCounter > 9)
                    break;
            }


        }catch (Exception e){

            e.printStackTrace();

        }finally {
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


    public static void writeMetaData(ResultSet resultSet) throws SQLException {
        //  Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));

        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }


}
