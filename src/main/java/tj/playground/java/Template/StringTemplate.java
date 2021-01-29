package tj.playground.java.Template;

import java.util.Date;

public class StringTemplate {
    public static void main(String[] args) {
        // Welcome TJ to our store on 12th Oct 2020
        String welcomeMessageFirstPart = "Welcome ";
        String welcomeMessageSecondPart = " to our store on ";

        String userName = "TJ";
        String date = new Date().toString();
        System.out.println(welcomeMessageFirstPart + userName + welcomeMessageSecondPart + date);

        // Using String Templates
        String welcomeMessageTemplate = "Welcome %s to our store on %s";
        String actualMessage = String.format(welcomeMessageTemplate, userName, date);

        System.out.println(actualMessage);

        // How to use this in SQL
        String queryTemplate = "SELECT `%s`, `%s`, `%s` FROM `customer` WHERE `%s` = %s";
        String col1 = "first_name";
        String col2 = "last_name";
        String col3 = "age";
        String table = "customer";
        String filterCol = "cust_id";
        String filterVal = "10";

        String query = String.format(queryTemplate, col1, col2, col3, table, filterCol, filterVal);

        System.out.println(query);
        //Adding a comment to check the jenkins build
        //adding this comment to check email noti in jenkins
    }

}
