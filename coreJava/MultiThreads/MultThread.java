package coreJava.MultiThreads;

public class MultThread implements Runnable{

    String name;
    Thread thread;
    
    MultThread(String threadName){
        name=threadName;
        thread=new Thread(this,name);
        System.out.println("New Thread: "+thread);
    }

    @Override
    public void run() {
      try {
        for(int i=5;i>0;i--){
            System.out.println(name+" "+i);
            Thread.sleep(500);
        }
      } catch (Exception e) {
         System.out.println(name+" Interrupted");
      }
      System.out.println(name+" exiting.");
    }
    
}
class MultiThreadDemo{
    public static void main(String[] args) {
        MultThread mt=new MultThread("one");
        MultThread mt2=new MultThread("two");
         MultThread mt3=new MultThread("three");
            
         mt.thread.start();
         mt2.thread.start();
        mt3.thread.start();

        try {
            System.out.println("Waiting for threads to finish. ");
            mt.thread.join();
            mt2.thread.join();
            mt3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread One is Alive: "+mt.thread.isAlive());
        System.out.println("Thread Two is Alive: "+mt2.thread.isAlive());
        System.out.println("Thread Three is Alive: "+mt3.thread.isAlive());

    }
}