package Volatile;

public class Thread1 extends Thread{
    boolean running = true;
    public void run(){
        System.out.println("thread started");
        while(running){

        }
        System.out.println("Thread stopeed");
    }
        public void stopping(){
            running = false;
        }
    
}