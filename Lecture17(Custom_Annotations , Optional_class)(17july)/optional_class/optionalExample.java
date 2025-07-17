package APC.Lecture17

import java.util.Optional;

(Custom_Annotations)(17july).optional_class;

public class optionalExample {
    public static void main(String args[]){
        String s1 = "abcd";
        String s2 = ""; //it will give empty string 
        String s3 = null; //on sout--it will give null pointer exception 
        
        Optional<String>op = Optional.ofNullable(s1);//these has methods 
        System.out.println(op.get());
        System.out.println(op.orElse("Hello"));
        //this is the use of optional class 

        if(op.isPresent()){
            System.out.println(op.get());
        }
        Optional<String> ops = Optional.empty();
        System.out.println(ops.get());

    }
}
