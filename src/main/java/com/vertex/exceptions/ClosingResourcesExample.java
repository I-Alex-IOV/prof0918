package com.vertex.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ClosingResourcesExample {

    private static final Logger logger = LoggerFactory.getLogger(ClosingResourcesExample.class);

    public String readFile(String path) {

        StringBuilder result = new StringBuilder();
        try (InputStream stream = ClosingResourcesExample.class.getClassLoader().getResourceAsStream(path);
             InputStreamReader inputStreamReader = new InputStreamReader(stream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                result.append(line).append("\n");
            }
        } catch (IOException | RuntimeException e) {
            logger.error("Exception while reading file {}", path, e);
            System.out.println("Exception while reading file: " + path);
            System.exit(17);
        } finally {
            System.out.println("Will never be printed");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ClosingResourcesExample example = new ClosingResourcesExample();

        String result = example.readFile("nosuchpath/example.properties");

        System.out.println(result);
    }
}
