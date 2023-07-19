package coreJava.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totalTime = 0;

        Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                String word = sc.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }

        Iterator<String> iterator=words.iterator();
            for(int i=1;i<=20 && iterator.hasNext();i++){
                System.out.println(iterator.next());
                System.out.println("*********");
                System.out.println(words.size()+" distinct words "+totalTime+" miliseconds");
            }
        }
    }

