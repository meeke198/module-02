package com.regex;
import java.util.regex.*;
public class MyRegex {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("a.");
//        Matcher m = p.matcher("as");
//        boolean b = m.matches();
//        System.out.println(b);
//        boolean b2 = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@").matcher("dfđsfdsf@dfgdf.4524").matches();
//        System.out.println(b2);
//        String text1 = "Hello java regex 2-12-2018, hello world 12/12/2018";
//
//        Pattern pattern = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
//
//        Matcher matcher = pattern.matcher(text1);
//
//        System.out.println("Ngày tháng trong chuỗi text1: " + text1);
//
//        while (matcher.find()) {
//            System.out.println(text1.substring(matcher.start(), matcher.end()));
//            System.out.println(matcher);
//
//        }
        System.out.println("Java Java Java".replaceAll("v\\w", "wi"));
        System.out.println("Java Java Java".replaceFirst("v\\w", "wi"));

    }
}
