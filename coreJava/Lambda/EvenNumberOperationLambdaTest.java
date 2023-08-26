package coreJava.Lambda;

public class EvenNumberOperationLambdaTest {
    
    private static int total;

    
    public static void main(String[] args) {
         EvenNumberOperation printer=(i)->System.out.println(i+"");
          pickEvenNumber(10, printer);
          
          System.out.println();

          pickEvenNumber(10, (i)->total+=i);
          System.out.println();

          pickEvenNumber(20, (i)->total%=i);
          System.out.println();

          pickEvenNumber(20, (i)->System.out.println(Math.sqrt(i)));
    }

    public static void pickEvenNumber(int n,EvenNumberOperation operation){
        for(int i=2;i<=n;i+=2)
             operation.operate(i);
    }
}
