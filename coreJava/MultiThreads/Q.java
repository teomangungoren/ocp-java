package coreJava.MultiThreads;

public class Q {
    int n;
    boolean valueSet=false;

  synchronized int get(){
    while(!valueSet){    
    try{
        wait();
    }catch(InterruptedException ex){
        System.out.println("ex caught");
    }
    }
    System.out.println("Got: "+n);
    valueSet=false;
    notify();
    return n;
    }

    synchronized void put(int n){
        while(valueSet)
        try{
            wait();
        }catch(InterruptedException ex){
            System.out.println("ex caught");
        }
        this.n=n;
        valueSet=true;
        System.out.println("Put: "+n);
        notify();
    }
    }

    class Producer implements Runnable{
        Q q;
        Thread thread;

        Producer(Q q){
            this.q=q;
            thread=new Thread(this,"Producer");
        }

        public void run(){
            int i=0;

            while(true){
                q.put(i++);
            }
        }
    }

    class Consumer implements Runnable{
        Q q;
        Thread thread;

        Consumer(Q q){
            this.q=q;
            thread=new Thread(this, "Consumer");
        }

        public void run(){
            while(true){
                q.get();
            }
        }
    }
class Pc{
    public static void main(String[] args) {
        Q q=new Q();
        Producer producer=new Producer(q);
        Consumer consumer=new Consumer(q);

        producer.thread.start();
        consumer.thread.start();

        System.out.println("To exit press control-c");
    }
}