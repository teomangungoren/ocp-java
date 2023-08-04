package coreJava.Oop;

public class Poli {
    void callMe(){
     System.out.println("Inside Poli's callme method");
    }
}

    class B extends Poli{
        void callMe(){
            System.out.println("Inside B's callme method");
        }
    }
    class C extends Poli{
      void callMe(){
        System.out.println("Inside C's callme method");
      }
    }

