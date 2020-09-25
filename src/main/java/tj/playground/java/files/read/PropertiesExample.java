package tj.playground.java.files.read;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {

        String configPropertiesFilePath = "data/configuration.properties";
        File configFile = new File(configPropertiesFilePath);

        Properties configProperties = new Properties();

        java.io.FileReader configFileReader;

        try {
            configFileReader = new FileReader(configFile);
            configProperties.load(configFileReader);

            System.out.println("Property 'selenium.driver.chrome' : " + configProperties.getProperty("selenium.driver.chrome"));
            System.out.println("Property 'selenium.driver.gecko' : " + configProperties.getProperty("selenium.driver.gecko"));
        } catch (Exception e) {
            System.out.println("Error occurred : " + e.getMessage());
        }
    }
}
