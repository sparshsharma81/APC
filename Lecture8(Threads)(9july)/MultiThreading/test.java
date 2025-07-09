public class test{
    public static void main(String args[]){
        MyThread tm = new MyThread();
        tm.start();
        for(int i=0;i<10;i++){
            System.out.println("parent class");
            try{

                Thread.sleep(5000);

//sleep is a check exception --- sleep can raise exception ...
//in check..we need to handle the exception there...
//it will raise InterruptedException 
//it can raise when i execute at infinite number 

            }
            catch(InterruptedException e){
                //TODO: handle exception

                System.out.println("Hello");
            }
        }
    }
}