package coreJava.Strings;

public class ReverseDemo {
    public static void main(String[] args) {
        
        StringBuilder s=new StringBuilder("abcdef");

        System.out.println(s);
        s.reverse();
        System.out.println(s);


    s.delete(2, 3);
    System.out.println("After delete: "+s);

    s.deleteCharAt(4);
    System.out.println("After deleteCharAt: "+s);
    }
    
}
