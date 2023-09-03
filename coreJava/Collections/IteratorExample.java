package coreJava.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> st=new ArrayList<>();
        st.add("theo");
        st.add("efloud");
        st.add("alex");

        Iterator<String> iterator=st.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator=st.listIterator(st.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
