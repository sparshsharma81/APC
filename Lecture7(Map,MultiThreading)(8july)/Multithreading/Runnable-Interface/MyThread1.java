package Multithreading;
public class MyThread1 implements Runnable{
    public static void main(String args[]){
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Parent class");
        }
    }
}