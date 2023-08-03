package coreJava.Oop;

public class VarArgs {

    static void test(int ... v){
        System.out.println("vaTest(int ...): "+
                           "Number of args: "+v.length+
                            " Contents: ");
           
            for(int x:v){
                System.out.print(x+" ");
                System.out.println();
            }
    }

    static void test(boolean ... v){
        System.out.println("vaTest(boolean...): "+
                         "Number of args: "+v.length+
                          "Contents: ");

            for(boolean x:v){
                System.out.print(x+" ");
                System.out.println();
            }
    }
    public static void main(String[] args) {
          test(1,2,3);
          test(true,false);        
    }
    
}
