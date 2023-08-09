package coreJava.MultiThreads;

public class CurrentThread {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println("Current thread: "+thread);

        thread.setName("My Thread");
        System.out.println("After name change: "+thread);

        try{
            for (int i = 5; i >0; i--) {
                System.out.println(i);
                Thread.sleep(1200);
            }
      }
      catch(InterruptedException exception){
        System.out.println("Main thread interrupted");
      }
    }
    
}
