package com.lesson09ArrayList;

public class ArrayExample01 {

    public static void main(String[] args) {
        // 1. Declare but not initialize elements value in array
        int[] a; //a integer array have not know number of elements
        int b[]; //a integer array have not know number of elements
        String[] c = new String[5];//a integer array known number of elements

        // 2. Declare and initialize elements value in array
        double[] d1 = new double[] {1, 2, 3};
        double[] d2 = {1, 2, 3};

        int[] arr = {1, 3, 5, 7};
//        System.out.printf("arr[2] first time: %d", arr[2]);
        System.out.printf("arr[2], arr[3] first time: %d, %d, %d", arr[2], arr[3], arr[3]);
        arr[2] = 10;
//        System.out.printf("\narr[2] second time: %d", arr[2]);
//        System.out.printf("\nNumber of elements in arr array is: %d", arr.length);

        System.out.print("\nArray is for loop is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nArray is for-each loop is: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}