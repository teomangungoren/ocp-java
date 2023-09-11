package coreJava.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
    
        Map<String,Double> hm=new HashMap<String,Double>();

        hm.put("John Doe",3030.34);
        hm.put("Tom Smith", 123.32);
        hm.put("Jane Baker", 99.32);

        Set<Map.Entry<String,Double>> set=hm.entrySet();   

        for (Map.Entry<String,Double> me:set) {
            System.out.print(me.getKey()+" :");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance=hm.get("John Doe");
        hm.put("John Doe", balance+100);
        
        System.out.println("John Doe's new balance: "+hm.get("John Doe"));


    }
}
