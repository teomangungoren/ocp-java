package coreJava.Strings;

public class ReplaceDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("This is a test.");

        sb.replace(3, 6, "was");
        System.out.println("After replace: "+sb);
    }
    
}
