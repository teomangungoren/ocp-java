package coreJava.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorDemo {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("rachel");
        myList.add("joey");
        myList.add("ross");

        Spliterator<String> spliterator=myList.spliterator();

        System.out.println("tryAdvance() ile işlenen ögeler:");
        while(spliterator.tryAdvance((x)->System.out.println(x)));

        System.out.println("\nforEachRemaining() ile işlenen öğeler:");
        spliterator=myList.spliterator();//reset spliterator
        spliterator.forEachRemaining(x->System.out.println(x));
    }
}
