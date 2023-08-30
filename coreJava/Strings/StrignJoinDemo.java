package coreJava.Strings;

public class StrignJoinDemo {
    public static void main(String[] args) {
        String result=String.join(" ","Alpha","Beta","Gamma");
        System.out.println(result);

        result=String.join(", ","John","ID#: 721","Email: teomangungoren@gmail.com");
        System.out.println(result);
    }
}
