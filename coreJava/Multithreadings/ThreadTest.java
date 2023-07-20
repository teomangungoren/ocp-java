package coreJava.Multithreadings;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadTest {
    public static final int MAX_PASSWORD=9999;
    public static void main(String[] args) {
     Random random=new Random();
     Vault vault=new Vault(random.nextInt(MAX_PASSWORD));

     List<Thread> threads=new ArrayList<>();
     threads.add(new AscendingHackerTread(vault));
     threads.add(new DescendingHackerTread(vault));
     threads.add(new PoliceThread());

     for(Thread thread:threads){
        thread.start();
     }
    }

    private static class Vault{
        private int password;
        public Vault(int password){
            this.password=password;
        }
        public boolean isCorrectPassword(int passwordGuess){
            try{
                Thread.sleep(100);
            }catch(InterruptedException ex){
            }
            return  this.password==passwordGuess;
        }
    }
    private static abstract class HackerTread extends  Thread {  
      public Vault vault;
       public HackerTread(Vault vault){
           this.vault=vault;
           this.setName(this.getClass().getSimpleName());
           this.setPriority(Thread.MAX_PRIORITY);}

        @Override
        public void start(){
            System.out.println("Starting thread: "+this.getName());
            super.start();
        }
    }
    private static class AscendingHackerTread extends HackerTread{
        public AscendingHackerTread(Vault vault){
            super(vault);
        }
        @Override
        public void run(){
          for(int guess=0;guess<MAX_PASSWORD;guess++){
            if(vault.isCorrectPassword(guess)){}
               System.out.println(this.getName()+" guessed the password "+guess);
               System.exit(0);  
        }
        }
    }
    private static class DescendingHackerTread extends HackerTread{
        public DescendingHackerTread(Vault vault){
            super(vault);
        }
        @Override
        public void run(){
            for(int guess=MAX_PASSWORD;guess>=0;guess--){
                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName()+" guessed the password "+guess);
                    System.exit(0);
                }
            }
        }
    }
    private static class PoliceThread extends Thread{
        @Override
        public void run(){
            for(int i=10;i>0;i--){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                System.out.println(i);
    }
    System.out.println("game over");
    System.exit(0);
        }
    }
        



}