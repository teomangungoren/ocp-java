package coreJava.Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      
        return o1.compareTo(o2);
     }
    
}

class ComparatorDemo{
    public static void main(String[] args) {
        Set<String> ts=new TreeSet<>((o1,o2)->o1.compareTo(o2));
        ts.add("C");
        ts.add("D");
        ts.add("A");
        ts.add("Z");



        for (String element : ts) {
            System.out.println(element+ " ");
        }

    }
}
