public class ThrowException {
    public static void main(String args[]){
       Sout(10/0);
       /*
        ERROR!
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Main.main(Main.java:6)

=== Code Exited With Errors ===


*/


//now after that..
  throw new ArithmeticException("Count divide by 0");
  /*
   ERROR!
Exception in thread "main" java.lang.NullPointerException: Count divide by 0
	at Main.main(Main.java:7)

=== Code Exited With Errors ===
   */

   int age =15;




        
        
    }
    public static void ageLimit(){
        if(age<18){
            throw new VotingAgeException("you are not allowed to vote");
        }
    }
}