package com.lesson16File;
import java.io.*;
import java.io.Reader;

public class ReadTextFile {
    public static void main(String[] args){
        try{
           File writer = new File("Hello.txt");
           FileReader fileReader = new FileReader(writer);
           BufferedReader reader = new BufferedReader(fileReader);
           String line = null;
           while((line = reader.readLine()) != null){
               System.out.println(line);
           }
           reader.close();
//           writer.write("hello");
//           writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
