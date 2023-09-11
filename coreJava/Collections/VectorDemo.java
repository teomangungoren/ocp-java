package coreJava.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>(3,2);

        System.out.println("Initial size: "+v.size());
        System.out.println("Initial capacity: "+v.capacity());

        v.add(2);
        v.add(3);
        v.add(4);
        v.add(1);
        v.add(8);

        System.out.println(v.capacity());

        System.out.println("First element: "+v.firstElement());
        System.out.println("Last element: "+v.lastElement());

        Enumeration<Integer>  vEnum=v.elements();

        while(vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement()+" ");
        }
        System.out.println();
    }
}
