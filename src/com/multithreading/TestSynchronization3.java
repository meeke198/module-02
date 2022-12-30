package com.multithreading;
public class TestSynchronization3 {

    public static void main(String args[]) {
        final Table obj = new Table();// tao mot object

        Thread t1 = new Thread() {
            public void run() {
                obj.printTable(5);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();

    }
}

//    Đồng bộ hóa là hành động giới hạn số luồng được phép truy cập tới một nguồn tài nguyên xuống còn 1 luồng tại bất kỳ thời điểm nào. Nhờ đó, nghiệp vụ của chương trình vẫn được nhất quán, trong khi vẫn tận dụng được ưu điểm về hiệu năng tới từ đa luồng.

