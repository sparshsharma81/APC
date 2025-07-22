public class chitkara{
    public static void main(String args[]){
        try{
            System.out.println("Inside try");
            throw new RuntimeException("Error");

        }
        finally{
            System.out.println("Inside Finally");
        }
    }
}