package com.sda.advanced.io.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class DemoProperties {

    public static void main(String[] args) throws IOException {
        String appConfigPath = "/home/cosmin/dev/sda/sda-group16/java-advanced/src/main/resources/io/app.properties";

        Properties properties = new Properties();
        properties.load(new FileInputStream(appConfigPath));

        System.out.println("version of the app = " +
            properties.getProperty("version"));

        Map<String, String> myMap = new HashMap<>();
        myMap.put("version", "1.0");
        System.out.println(myMap.get("version"));

    }
}
