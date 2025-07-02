public class lec3 {
    public static void main(String args[]){
        m1();
    }
    public static void m1(){
        System.out.println("m1 method is call");
        m2();
    }
    public static void m2(){
        m2();
        System.out.println("m2 method called");

    }
    public static void m3(){
        System.out.println("m3 method is called");
        System.out.println(10/0);
    }

}

/*
 m1 method is call
m3 method is called
5
m2 method called

=== Code Execution Successful ===

this will be the output of the file 

 */



 