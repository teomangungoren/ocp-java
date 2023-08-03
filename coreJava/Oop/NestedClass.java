package coreJava.Oop;

public class NestedClass {
 int outer_x=100;
 
 void test(){
    Inner inner=new Inner();
    inner.display();
 }

 class Inner{
    void display(){
        System.out.println("display:  outer_x: "+outer_x);
    }
 }

}

class InnerClassDemo{
    public static void main(String[] args) {
        NestedClass nes=new NestedClass();
        nes.test();
    }
}
