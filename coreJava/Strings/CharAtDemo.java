package coreJava.Strings;

public class CharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println("buffer before = "+sb);
        System.out.println("CharAt(1) before = "+sb.charAt(1));

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after = "+sb);
        System.out.println("charAt(1) after = "+sb.charAt(1));

        StringBuffer sb2=new StringBuffer("Hello World");
        char[] targetArray=new char[5];
        sb2.getChars(0, 5, targetArray, 0);

        StringBuffer sb3=new StringBuffer("Hello");
        sb3.append(",").append("World!").append(35);
    }
    
}
