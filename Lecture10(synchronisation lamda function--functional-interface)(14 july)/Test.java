public class Test{
    static int count =0;
    public static void main(String args[]){
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        try{
        t1.join();
        t2.join();

        }catch(InterruptedException e){
            ////TODO:
            /// 
        }

        //join method can give interrupted exception which is check excecption ---which would result in breaking of code
        System.out.println(count);

        //
    }
    public static void count(){
        count++;
    }
}
