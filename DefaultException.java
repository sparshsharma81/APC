public class DEfaultException{
    public static void main(String args[]){
        System.out.println("assigned");
Manager();
    }
    public static void Manager(){
        TeamLead();
        System.out.println("Assigned to Team Lead");

    }
    public static void TeamLead(){
        System.out.println(10/0);
        Employee();
    }
    public static void Employee(){
        System.out.println("I am doing great work");
    }

  }

  /*
   ERROR!
assigned
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Main.TeamLead(Main.java:12)
	at Main.Manager(Main.java:7)
	at Main.main(Main.java:4)

=== Code Exited With Errors ===

this code will output this
   */