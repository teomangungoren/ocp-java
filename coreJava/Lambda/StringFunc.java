package coreJava.Lambda;

@FunctionalInterface
public interface StringFunc {

    String func(String s);
}


class MyString{
    public static String strReverse(String str){
        String result="";
        int i;

        for(i=str.length()-1;i>=0;i--)
             result+=str.charAt(i);

             return result;
    } 
}

class Test{

    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inputString="Lambdas add power to Java";
        String outputString;

        outputString=stringOp(MyString::strReverse,inputString);

        System.out.println("Original String: "+inputString);
        System.out.println("String reversed: "+outputString);
    }

}