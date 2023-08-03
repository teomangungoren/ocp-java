

package coreJava.Oop;

/**
 * VarArgsTest
 */
public class VarArgsTest {

    public static void test(int ... x){
        System.out.println("Number of args:"+x.length+" Contents: ");

        for(int a:x){
            System.out.println("a: "+a);
        }
    }
    public static void main(String[] args) {
        VarArgsTest.test(1);
        VarArgsTest.test(1,2,3);
        VarArgsTest.test(3,6,9);
    }
    
}