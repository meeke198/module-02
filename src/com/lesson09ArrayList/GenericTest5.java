package com.lesson09ArrayList;
//Ký tự ? (dấu chấm hỏi) tượng trưng cho phần tử ký tự đại diện. Nó có nghĩa là bất kỳ loại nào. Nếu chúng ta viết <? mở rộng Number>, nó có nghĩa là bất kỳ lớp con của Number ví dụ như Integer, Float, Double vv. Bây giờ chúng ta có thể gọi phương thức của lớp Number qua bất kỳ đối tượng lớp con nào.
import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("ve hinh chu nhat.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("ve hinh tron.");
    }
}

public class GenericTest5 {
    // tao phuong thuc chi chap nhan tham so la lop con cua Shape
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();// goi phuong thuc cua lop Shape boi lop con
        }
    }

    public static void main(String args[]) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }
}
