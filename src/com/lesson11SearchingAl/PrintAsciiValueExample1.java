package com.lesson11SearchingAl;
import java.util.Scanner;
import java.util.ArrayList;
public class PrintAsciiValueExample1 {

//    public static int linearSearch(int[] array, int value) {
//        int index = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (value == array[i]){
//                index = i;
//                break;
//            }
//        }
//        return index;
//    }
    public static int linearSearch1(String inputStr) {
        int index = -1;
        int i = 0;
        String[] splitStr = inputStr.split("\\s+");
        for (String str : splitStr) {
            splitStr[i++] = str;
        }

        for (String str : splitStr) {
            splitStr[i++] = str;
        }

        return index;
//        return splitStr;
    }
//    public static int binarySearch(int arr[], int low, int high, int value) {
//        if (high>=low) {
//            int mid = low + (high - low)/2;
//            if (arr[mid] == value)
//                return mid;
//            if (arr[mid] > value)
//                return binarySearch(arr, low, mid-1, value);
//            return binarySearch(arr, mid+1, high, value);
//        }
//        return -1;
//    }
    public static void main(String[] args)
    {
// character whose ASCII value to be found
//        char ch1 = 'a';
//        char ch2 = 'b';
//// variable that stores the integer value of the character
//        int asciivalue1 = ch1;
//        int asciivalue2 = ch2;
//
//        System.out.println("The ASCII value of " + ch1 + " is: " + (char) asciivalue1);
//        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);
        Scanner input = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= input.nextLine();              //reads string
        System.out.println(linearSearch1(str));
    }
}