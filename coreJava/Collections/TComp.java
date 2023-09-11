package coreJava.Collections;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * TComp
 */
public class TComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
       int i,j,k;

       i=o1.lastIndexOf(" ");
       j=o2.lastIndexOf(" ");

       k=o1.substring(i).compareToIgnoreCase(o2.substring(j));
       if(k==0)
           return o1.compareToIgnoreCase(o2);
       else
           return k;
    }

}

class TreeMapDemo2{
    public static void main(String[] args) {
        TreeMap<String,Double> tm=new TreeMap<>(new TComp());
        tm.put("Teoman Gungoren", 343.3);
        tm.put("Alex Dem", 321.3);
        tm.put("Joe Doe", 352.1);

        Set<Map.Entry<String,Double>> set=tm.entrySet();

        for (Map.Entry<String,Double> entry : set) {
            System.out.print(entry.getKey()+" : ");
            System.out.println(entry.getValue());
        }
        System.out.println();

        double balance=tm.get("Teoman Gungoren");
        tm.put("Teoman Gungoren", balance+100);

        System.out.println("Teoman Gungoren'S new balance: "+tm.get("Teoman Gungoren"));
    }

}