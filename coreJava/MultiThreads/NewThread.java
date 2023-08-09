package coreJava.MultiThreads;

public class NewThread implements Runnable {
     Thread thread;

    NewThread(){
        thread=new Thread(this,"Demo Thread");
        System.out.println("Child Thread: "+thread);
    }


    @Override
    public void run() {
        try {
            for (int i=6; i>0 ; i--) {
                System.out.println("Child Thread" +i);
                Thread.sleep(750);
            }
        } catch (Exception e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Existing child thread");
    }
    }

    class ThreadDemo{
        public static void main(String[] args) {
            NewThread nt=new NewThread();
            nt.thread.start();

           try {
            for (int i=6; i>0 ; i--) {
                System.out.println("Main Thread" +i);
                Thread.sleep(1250);
            }
        } catch (Exception e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread existing");
        }
    }