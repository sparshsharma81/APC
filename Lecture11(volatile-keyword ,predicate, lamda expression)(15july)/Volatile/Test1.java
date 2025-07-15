package Volatile;

public class Test1 {
    public static void main(String args[]){
        Thread1 t1 = new Thread1();
        t1.start();
        try{
            Thread.sleep(2000);

        }
        catch(InterruptedException e){
            //TODO: handle exception 
        }
        t1.stopping();
    }
}

