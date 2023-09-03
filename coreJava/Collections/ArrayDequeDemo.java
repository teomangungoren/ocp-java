package coreJava.Collections;

import java.util.ArrayDeque;

/**
 * ArrayDequeDemo
 */
public class ArrayDequeDemo {

    public static void main(String[] args) {
        ArrayDeque<String> adq=new ArrayDeque<>();
        adq.push("rachel");
        adq.push("alex");
        adq.push("monica");

        System.out.println(adq);

        while(adq.peek()!=null){
            System.out.println(adq.pop()+"");
        }

        System.out.println(adq);
    }
    
}