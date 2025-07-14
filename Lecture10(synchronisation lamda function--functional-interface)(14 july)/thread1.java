public class thread1{
    int count =0;

    public static void main(String args[]){
      Thread1 t1 = new Thread1();
      Thread2 t2 = new Thread2();
      t1.start();
      t2.start();

    }
    public void counter(){
        count++;
    }
}