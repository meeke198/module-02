package com.lesson16File;
import java.io.IOException;
import java.io.*;
//Lớp java.io.PrintWriter có thể được sử dụng để tạo file và ghi dữ liệu vào file văn bản.
public class WriteData {
    public static void main(String[] args) throws IOException {

        File file = new File("hello.txt");

        if (file.exists()) {

            System.out.println("File already exists");

            System.exit(1);
        }


        // Create a file

        java.io.PrintWriter output = new java.io.PrintWriter(file);


        // Write formatted output to the file


        output.print("Eric K Jones ");
        output.println(90);
        output.print("Codegym Sai Gon");
        output.println(85);


        // Close the file

        output.close();

    }
}