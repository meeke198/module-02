package com.leson3;

import java.util.Scanner;
import java.util.*;

public class baitap01XoaPhanTuTrongMang {
    public static int[] deleteEle(int num, int[] array) {
        boolean flag = false;
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                flag = true;
                continue;
            } else {
                newArr[i] = array[i];
            }
        }
       if(!flag) System.out.println("Mang khong chua " + num);
        return newArr;
    }
    public static void main(String[] args) {
        int deleteNum;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Enter the element to delete: ");
        Scanner input = new Scanner(System.in);
        deleteNum = input.nextInt();
        System.out.println("Array after delete ele " + deleteNum + Arrays.toString(deleteEle(deleteNum, array)));
    }
}

