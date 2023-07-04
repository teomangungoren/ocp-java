
package coreJava.Interfaces.Comparate;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ComparatorTest
 */
public class ComparatorTest {

    public static void main(String[] args) {
       
       String[] friends={"Joe","Monica","Chandler","Ross","Rachelssss"};
       Arrays.sort(friends,new LengthComparator());
      for (String s : friends) {
          System.out.println(s);
      }
    }
}