public class project {
    public static void main(String args[]){
        try{
            String s = null;
            System.out.println(10/0);
            System.out.println(s.length());

        }
        
         catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        }
        catch(NullPointerException E){
            System.out.println("Nullpointer exception " + E);
        }
        catch(Exception e){
            System.out.println("Other exception");
        }
    }
}

        
    

