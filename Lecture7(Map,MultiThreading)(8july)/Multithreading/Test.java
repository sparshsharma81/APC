package Multithreading;
public class Test{
    public static void main(String args[]){
        MyThread t = new MyThread();
        t.start();
        //using this t.start() --- the thread will start executing 

        for(int i=0;i<10;i++){
            System.out.println("parent class");
        }
    }
}

//whenever more than one thread executes..then it will execute at randon order ---
//it executes randomly 