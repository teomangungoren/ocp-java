package coreJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapViewTest {
    public static void main(String[] args) {
        Map<String,Integer> friends=new HashMap<>();
        friends.put("joey",23);
        friends.put("monica",24);
        friends.put("chandler", 25);
        friends.put("rachel",27);
        friends.put("ross", 30);
        
        for(Map.Entry<String,Integer> entry:friends.entrySet()){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println("Key: "+key+" Value: "+value);
        }
    }
}
