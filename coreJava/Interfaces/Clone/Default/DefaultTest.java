package coreJava.Interfaces.Clone.Default;

public class DefaultTest {
 public static void main(String[] args) {
    Ex ex1=new MyEx();
    ex1.test();
    ex1.testDefault();
 }    
}

interface Ex{
    void test();
    default void testDefault(){
        System.out.println("Default method test");
    }
}

class MyEx implements Ex{

    @Override
    public void test() {
    System.out.println("I'm in the MyEx");
}
    }
