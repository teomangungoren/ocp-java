package coreJava.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {
   public static void main(String[] args) {
    HashSet<String> hs=new HashSet<>();

    hs.add("Rachel");
    hs.add("Ross");
    hs.add("Joey");

    System.out.println(hs);

    TreeSet<String> ts=new TreeSet<>(hs);
    System.out.println(ts);
   }
}
