package coreJava.Oop;

/**
 * StackEncapsulationExample
 */
public class StackEncapsulationExample {

    int[] stck=new int[10];
    int tos;

    StackEncapsulationExample(){
        tos=-1;
    }

    //push an item onto the stack

    void push(int item){
        if(tos==9)
          System.out.println("Stack is full");
          else
            stck[++tos]=item;
    }

    //pop an item from the stack
    int pop(){
        if(tos<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
        return stck[tos--];
    }

    

    
}