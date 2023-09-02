public class NewThread extends Thread {

    boolean suspendFlag;

    NewThread(String threadName,ThreadGroup treadGroup){
        super(treadGroup, threadName);
        suspendFlag=false;
    }

    public void run(){
        try{
            for (int i = 5; i > 5; i--) {
                System.out.println(getName()+": "+i);
                Thread.sleep(1000);
                synchronized(this){
                    while(suspendFlag){
                        wait();
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Exception in "+getName());
        }
        System.out.println(getName()+" exiting. ");
    }
    synchronized void mySuspend(){
        suspendFlag=true;
    }
    synchronized void myResume(){
        suspendFlag=false;
        notify();
    }
}
class ThreadGroupDemo{
    public static void main(String[] args) {
        ThreadGroup groupA=new ThreadGroup("Group A");
        ThreadGroup groupB=new ThreadGroup("Group B");

        NewThread th1=new NewThread("ONE", groupA);
        NewThread th2=new NewThread("TWO", groupB);
        NewThread th3=new NewThread("THREE", groupA);
 
       th1.start();
       th2.start();
       th3.start();

       System.out.println("\nHere is output from list():");
       groupA.list();
       groupB.list();
       System.out.println();

       System.out.println("Suspending Group A");
       Thread[] tga=new Thread[groupA.activeCount()];
       groupA.enumerate(tga);//get threads in group
       for (int i = 0; i < tga.length; i++) {
        ((NewThread)tga[i]).mySuspend();//suspend each thread 
       }
       try{
          Thread.sleep(4000);
     }catch(InterruptedException e){
        System.out.println("Main thread interrupted");
     }
     System.out.println("Resuming Group A");
     for (int i = 0; i < tga.length; i++) {
        ((NewThread)tga[i]).myResume();//resume threads in group
     }

     //wait for to finish
     try{
        System.out.println("Waiting for threads to finish");
        th1.join();
        th2.join();
        th3.join();
     }catch(Exception e){
        System.out.println("Exception in Main Thread");
     }
     System.out.println("Main thread exiting");
    }
}