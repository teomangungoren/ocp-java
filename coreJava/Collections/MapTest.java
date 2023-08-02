package coreJava.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    
    public static void main(String[] args) {
        Map<String,Employee> staff=new HashMap<>();
        staff.put("122-111",new Employee("teomang"));
        staff.put("122-333",new Employee("bezaqd"));
        staff.put("124-222",new Employee("artska"));

        System.out.println(staff);

        staff.remove("122-333");

        staff.put("122-334", new Employee("gokqwe"));

        System.out.println(staff.get("122-334"));

        staff.forEach((k,v)->
        System.out.println("key="+k+",value= "+v));

    }

    
}

class Employee{
    public String name;

    public Employee(String name){
        this.name=name;
    }
}
