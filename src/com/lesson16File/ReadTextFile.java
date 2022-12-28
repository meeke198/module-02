package com.lesson16File;
import java.io.*;
import java.io.Reader;
//Bộ nhớ đệm (buffer) cho ta một nơi lưu trữ tạm thời để tăng hiệu quả của thao tác đọc/ghi dữ liệu.
public class ReadTextFile {
    public static void main(String[] args){
        try{
           File writer = new File("hello.txt");
//           noi mot file reader voi mot file text
           FileReader fileReader = new FileReader(writer);
//           noi buffer reader voi mot file text
           BufferedReader reader = new BufferedReader(fileReader);
           String line = null;
//           doc tung dong cho toi khi khong doc duoc gi nua
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
