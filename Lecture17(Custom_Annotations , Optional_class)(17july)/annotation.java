package APC.Lecture17(Custom_Annotations)(17july);
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value(); // this is an attribute
}


/*
 @Retention(RetentionPolicy.RUNTIME) → This tells Java to keep the annotation at runtime, so it can be accessed using reflection.

@Target(ElementType.METHOD) → This says the annotation can only be used on methods.

value() → This is like a parameter to pass to your annotation.


 */
public class annotation {
     @MyAnnotation("This is a custom method")
    public void myMethod() {
        System.out.println("Inside myMethod");
    }
}
