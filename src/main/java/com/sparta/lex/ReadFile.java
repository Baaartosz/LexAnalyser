package com.sparta.lex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    /**
        Returns a lowercase string of data in text file.
     */
    public static String getData(String filePath){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            File fileObject = new File(filePath);
            Scanner fileReader = new Scanner(fileObject);

            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                stringBuilder.append(data.toLowerCase());
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println("An error occurred: File not found.");
            //e.printStackTrace();
        }
        return stringBuilder.toString();
    }

}
