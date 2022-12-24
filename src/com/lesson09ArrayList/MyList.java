package com.lesson09ArrayList;
import java.util.Arrays;
public class MyList<E> {
   private int size = 0;
   private static final int DEFAULT_CAPACITY = 10;
   private Object[] elements;
   public MyList(){
       elements = new Object[DEFAULT_CAPACITY];
   }
    public void ensureCapa(){
       int newSize = elements.length * 2;
       elements = Arrays.copyOf(elements, newSize);
    }
   public void add(E newElement){
      if(size == elements.length){
          ensureCapa();
      }
      elements[size++] = newElement;
   }

   public E get(int index){
       if (index>= size || index <0) {
           throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
       }
       return (E) elements[index];
   }
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
//
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
