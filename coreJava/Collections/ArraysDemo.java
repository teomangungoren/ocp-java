package coreJava.Collections;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]= -4*i;
        }

        System.out.print("Original contents: ");
        display(array);
        Arrays.sort(array);
        System.out.println();
        display(array);

        //binary search for -9
        int index=Arrays.binarySearch(array,-9);
        System.out.println(index);
    }

    static void display(int[] array){
        for (int i : array) {
            System.out.print(i+" - ");
        }
        System.out.println();
    }
}
