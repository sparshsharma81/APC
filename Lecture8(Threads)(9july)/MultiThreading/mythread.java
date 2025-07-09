package Multithreading;

public class mythread extends Thread{
    pubilc void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child class");
        }
    }
}