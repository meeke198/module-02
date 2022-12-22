package com.lesson09ArrayList;
import java.util.ArrayList;
import java.util.List;
public class IteratorExample03 {
    public static void main(String[] args) {
        // Create list with no parameter
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            // Add element to list
            list.add("0" + i);
        }

        // traversing the list in the
        // forward direction
        for (int i = 0; i < 5; i++) {
            list.remove(i);
        }
    }
}
