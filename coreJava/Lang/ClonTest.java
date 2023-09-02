import coreJava.Interfaces.Clone.CloneTest;

public class ClonTest implements Cloneable {
    int a;
    double b;
    
    ClonTest testClone(){
        try{
            return(ClonTest) super.clone();
        }catch(CloneNotSupportedException e){
            System.out.println("Cloning not allowed. ");
            return this;
        }
    }
}

class CloneDemo{
    public static void main(String[] args) {
        ClonTest x1=new ClonTest();
        ClonTest x2;
        x1.a=10;
        x1.b=20.90;

        x2=x1.testClone();

        System.out.println(x2.a);
        System.out.println(x2.b);
             
    }
}
