public class TestClone implements Cloneable {
  int a;
  double b;

  public Object clone(){
    try{
        return super.clone();
    }catch(CloneNotSupportedException e){
        System.out.println("Cloniing not allowed");
        return this;
    }
  }
    }
    class CloneTest2{
        public static void main(String[] args) {
            TestClone x1=new TestClone();
            TestClone x2;
            x1.a=101;
            x1.b=12.9;
          
            x2=(TestClone)x1.clone();

            System.out.println(x2.a);
            System.out.println(x2.b);
        }
    }
