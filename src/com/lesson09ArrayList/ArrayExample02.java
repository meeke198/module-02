package com.lesson09ArrayList;

public class ArrayExample02 {
    public static void main(String[] args) {
        String[] originalArr = {"01", "02", "03", "04", "05"};
        System.out.print("Original array length is: " + originalArr.length);

        System.out.print("\nOriginal array is: ");
        for (String oElement : originalArr) {
            System.out.print(oElement + " ");
        }

        System.out.print("\n---------------------");
        int newArrLength = originalArr.length + 1;
        String[] newArr = new String[newArrLength];
        System.out.print("\nNew array length is: " + newArr.length);

        //Insert new element "034" at position 3 without lost any elements
        System.out.println("\nInserting new element.........");
        String newElement = "034";
        int insertingPosition = 3;
        for (int i = 0; i < newArrLength; i++) {
            if (i < insertingPosition - 1)
                newArr[i] = originalArr[i];
            else if (i == insertingPosition - 1)
                newArr[i] = newElement;
            else
                newArr[i] = originalArr[i - 1];
        }

        System.out.print("New array is: ");
        for (String nElement : newArr) {
            System.out.print(nElement + " ");
        }
    }
}
