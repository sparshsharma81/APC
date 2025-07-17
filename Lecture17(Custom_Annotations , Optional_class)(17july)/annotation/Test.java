package APC.Lecture17(Custom_Annotations)(17july).annotation;
import java.lang.annotation.*;


@Target(ElementType.TYPE) //type mtlb vo class ko access kar sake ...
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone
{
    String calling() default "Voice call";
    int version() default 5;
}

@SmartPhone
public class Test {
    int model =9;
}
