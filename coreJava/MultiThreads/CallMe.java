package coreJava.MultiThreads;

public class CallMe {
 synchronized void call(String msg){
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
    
}

class Caller implements Runnable{
    String msg;
    CallMe target;
    Thread thread;

    public Caller(CallMe target,String msg){
       this.target=target;
       this.msg=msg;
       thread=new Thread(this);
    }

    public void run(){
        target.call(msg);
    }
}

class Synch{
    public static void main(String[] args) {
        CallMe target=new CallMe();
        Caller ob1=new Caller(target, "Hello");
        Caller ob2=new Caller(target, "Synchronized");
        Caller ob3=new Caller(target, "World");

        ob1.thread.start();
        ob2.thread.start();
        ob3.thread.start();

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
    }
}
