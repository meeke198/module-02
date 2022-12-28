package com.lesson16File;

import com.lesson16File.Student;
import java.io.PrintWriter;

    public class WriteText {
        public static void main(String[] args) {
            try {
                PrintWriter pw = new PrintWriter("/Users/hienthu/Documents/codegym/module-02-Advanced-Programming-with-Java/source/lesson-01-introduction-to-java/lesson-01/hello.txt");
                pw.println("Xin Chao, tù tên mính");
                pw.print("Nice to meet you all");
                pw.print(25);
                pw.print(' ');
                pw.print("La so PI");
                pw.println();

                Student st = new Student(100, "Nguyen Van A");
                pw.println(st);
                pw.flush();
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

