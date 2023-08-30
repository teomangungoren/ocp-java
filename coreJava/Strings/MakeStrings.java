package coreJava.Strings;

public class MakeStrings {

    public static void main(String[] args) {
        char c[]={'J','A','V','A'};
        String s1=new String(c);
        String s2=new String(s1);

        String s3=new String(c,1,2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

byte[] ascii={65,62,66,55,70};
    String s4=new String(ascii);
    System.out.println(s4);
  
    
   String longString="This could have been "+
    "a very long line that would have  "+
    "wrapped around. But string concatenation "+
    "prevents this. ";

    System.out.println(longString);


    }
    
}
