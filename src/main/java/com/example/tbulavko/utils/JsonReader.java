package com.example.tbulavko.utils;

import com.example.tbulavko.business.models.Customer;
import com.example.tbulavko.core.logger.Log4jLogger;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Tatiana_Bulavko on 11/10/2019
 */
public class JsonReader {

    public Customer getCustomer(String fileName) {
        byte[] jsonData;
        String stringPath = "";
        try {
            stringPath = new File("").getCanonicalPath()
                    + "\\src\\main\\java\\com\\example\\tbulavko\\testdata\\customers\\" + fileName + ".json";
            Path path = Paths.get(stringPath);
            jsonData = Files.readAllBytes(path);
        } catch (IOException e) {
            Log4jLogger.error("Could not read a file: " + stringPath);
            throw new RuntimeException(e.getMessage());
        }
        ObjectMapper objectMapper = new ObjectMapper();

        Customer emp = null;
        try {
             emp = objectMapper.readValue(jsonData, Customer.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return emp;
    }
}
