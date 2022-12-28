package com.lesson14Sorting;
public class insertionSort{
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 7, 1, 15, 8, 12, 11, 9, 5};
        insertionSort(arr1);
    }
}

