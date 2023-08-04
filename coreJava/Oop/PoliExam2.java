
package coreJava.Oop;

/**
 * PoliExam2
 */
public class PoliExam2 {
  
    public static void main(String[] args) {
        Rectangle r=new Rectangle(8, 4);
        Triangle t=new Triangle(10, 2);
        Figure f=r;
       System.out.println("Area is: "+f.area());
        f=t;
        System.out.println("Area is: "+f.area());
    }
  
    
}

abstract class Figure{
  public double dim1,dim2;
 
    Figure(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract double area();
}

class Rectangle extends Figure{

    Rectangle(double a,double b){
        super(a, b);
    }
    
    @Override
    double area() {
        System.out.println("Inside Area for Rectangle.");   
       return dim1*dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a,double b){
        super(a, b);
    }

    double area(){
        System.out.println("Inside Area for Triangle");
        return dim1*dim2/2;
    }
}