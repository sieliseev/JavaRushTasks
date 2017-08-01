package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        load(inputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties propertiesStream = new Properties();
        propertiesStream.putAll(properties);
        propertiesStream.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties propertiesStream = new Properties();
        propertiesStream.load(inputStream);
        for (Map.Entry<Object, Object> pair : propertiesStream.entrySet()) {
            properties.put((String) pair.getKey(), (String) pair.getValue());
        }
    }

    public static void main(String[] args) {

    }
}
