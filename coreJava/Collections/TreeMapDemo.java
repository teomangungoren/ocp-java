package coreJava.Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> tm=new TreeMap<>();

        tm.put("Rachel", 25);
        tm.put("Ross",23);
        tm.put("Monica", 26);
         
        Set<Map.Entry<String,Integer>> set=tm.entrySet();

        for (Map.Entry<String,Integer> me: set) {
            System.out.print(me.getKey()+" : ");
            System.out.println(me.getValue());
        }
         System.out.println();

         int age=tm.get("Rachel");
         tm.put("Rachel", age+5);

         System.out.println("Rachel's age:  "+tm.get("Rachel"));
    }
}
