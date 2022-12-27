package com.lesson11SearchingAl;
public class linearSearch{
    public static int linearSearch1(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    public static int binarySearch(int arr[], int low, int high, int value) {
        if (high>=low) {
            int mid = low + (high - low)/2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarySearch(arr, low, mid-1, value);
            return binarySearch(arr, mid+1, high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 6};

        int[] arr2 = {1, 3, 4, 5, 6, 8, 9, 10, 15, 17};
        System.out.println(linearSearch1(arr, 9));
        System.out.println(binarySearch(arr2, 0, 10, 16));
    }
}



