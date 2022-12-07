
package com.leson3;

import java.util.Arrays;
import java.util.Scanner;

public class thucHanhDaoNguocSo {
    public static void main(String[] args) {
        int size;
        int[] array;

        System.out.print("Enter a size: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        if (size > 20) System.out.println("Size does not exceed 20");
        array = new int[size];
        int i = 0;
        while (i < size){
            System.out.println("Enter element " + (i + 1));
            array[i] = input.nextInt();
            i++;
        }
        System.out.printf(size + " elements in the array: ");
//        for(int j = 0; j < size; j++){
//            System.out.print(array[j] + "\t");
//        }
        System.out.println(Arrays.toString(array));
        System.out.printf(size + " elements in the reversed array: ");
//        for(int j = 0; j < array.length / 2; j++){
//            int temp = array[j];
//            array[j] = array[size - 1 - j];
//            array[size - 1 - j] = temp;
//        }

        int x = 0;
        while(x != (size - x - 1)){
            int temp = array[x];
            array[x] = array[size - x - 1];
            array[size - x - 1] = temp;
            ++x;
        }
        for(int j = 0; j < size; j++){
            System.out.print(array[j] + "\t");
        }

    }
}
