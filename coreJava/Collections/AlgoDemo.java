package coreJava.Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgoDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(-9);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(12);

        Comparator<Integer> r=Collections.reverseOrder();

        Collections.sort(list,r);

        System.out.println("listed sorted in reverse");

        for (Integer number: list) {
            System.out.println(number);
        }

        System.out.println("Minimum: "+Collections.min(list));
        System.out.println("Maximum: "+Collections.max(list));
    }
}
