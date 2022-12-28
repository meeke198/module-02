package com.lesson16File;
import java.io.*;
import java.io.InputStream;
public class TestFileClass {
    public static void main(String[] args) throws IOException  {
        java.io.File file = new java.io.File("/Users/hienthu/Documents/codegym/module-02-Advanced-Programming-with-Java/source/lesson-01-introduction-to-java/lesson-01");
        System.out.println("Does it exist " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());

        int i = System.in.read();
        System.out.println(i);
    }

}
