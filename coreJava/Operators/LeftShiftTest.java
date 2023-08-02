package coreJava.Operators;

public class LeftShiftTest {
    public static void main(String[] args) {
        
        byte a=10; //00001010
        int result=a<<2; //00001010 -> 00101000
        byte castedResult=(byte)result; //cast the int result back to byte
        System.out.println("Result: "+castedResult);
    }
    
}
