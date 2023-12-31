package coreJava.Collections;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts=new TreeSet<>();
         parts.add(new Item("Toaster", 1234));
         parts.add(new Item("Widget", 4556));
         parts.add(new Item("Modem",9912));
         System.out.println(parts);
         
         NavigableSet<Item> sortByDescription=new TreeSet<>(
            Comparator.comparing(Item::getDescription));
          sortByDescription.addAll(parts);
          System.out.println(sortByDescription);
    }
}
 
/**
 * InnerTreeSetTest
 */
 class Item implements Comparable<Item>{

    private String description;
    private int partNumber;
     
    public Item(String description,int partNumber){
        this.description=description;
        this.partNumber=partNumber;
    }

    public String getDescription(){
        return description;
    }
    
    @Override
    public String toString() {
        return "Item [description=" + description + ", partNumber=" + partNumber + "]";
    }

    public boolean equals(Object otherObject){
        if(this==otherObject)return true;
        if(otherObject==null) return false;
        if(getClass()!=otherObject.getClass())return false;
        Item other=(Item) otherObject;
        return Objects.equals(description, other.description)&& partNumber==other.partNumber;

    }

    public int hashCode(){
        return Objects.hash(description,partNumber);
    }


    @Override
    public int compareTo(Item other) {
        int diff=Integer.compare(partNumber,other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }

 }
