package coreJava.reflectionExample.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * CopyOfTest
 */
public class CopyOfTest {

    public static Object copyOfArray(Object x,int newLength){
        Class cl=x.getClass();
        if(!cl.isArray())return null;
        Class componentType=cl.getComponentType();
        int length=Array.getLength(x);
        Object newArray=Array.newInstance(componentType, newLength);
        System.arraycopy(x, 0,newArray, 1,Math.min(length, newLength));
        return newArray;
    }

    public static void main(String[] args) {
        int[] array={1,2,4,5};
        array=(int[])copyOfArray(array, 6);
        System.out.println(Arrays.toString(array));
    }
    
}