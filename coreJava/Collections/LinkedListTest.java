package coreJava.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        List<String> friends=new LinkedList<>();
        friends.add("Chandler");
        friends.add("Ross");
        friends.add("Monica");
        friends.add("Rachel");
        friends.add("Joey");

        List<String> himym=new LinkedList<>();
        himym.add("Ted");
        himym.add("Barney");
        himym.add("Robin");
        himym.add("Lily");
        himym.add("Marshall");

        ListIterator<String> friendsIterator=friends.listIterator();
        Iterator<String> himymIterator= himym.iterator();

        // merge the words from b into a

        while(himymIterator.hasNext()){
            if(friendsIterator.hasNext()) friendsIterator.next();
            friendsIterator.add(himymIterator.next());
        }
        System.out.println(friends);

        //remove every second word from himym

        himymIterator=himym.iterator();
        while(himymIterator.hasNext()){
            himymIterator.next();
            if(himymIterator.hasNext()){
                himymIterator.next();
                himymIterator.remove();
            }
        }
        System.out.println(himym);

        // merge the words from b into a

        friends.removeAll(himym);
        System.out.println(friends);





    }
}
