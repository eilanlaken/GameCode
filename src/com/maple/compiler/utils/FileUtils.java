package com.maple.compiler.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

    public static String getFileString(final String filepath) {
        StringBuilder source = new StringBuilder("");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                source.append(line + " ");
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            Debugger.print("Error: source not found.");
            Debugger.print(e);
        } catch (IOException e) {
            Debugger.print("IO Exception.");
            Debugger.print(e);
        }
        return source.toString();
    }

}
