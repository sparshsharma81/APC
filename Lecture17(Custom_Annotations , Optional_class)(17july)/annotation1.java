package APC.Lecture17(Custom_Annotations)(17july);

public class annotation1 {
     public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass();

        annotation m = obj.getClass().getMethod("myMethod");

        // Check if method has the annotation
        if (m.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation value: " + annotation.value());
        }

        obj.myMethod();
    }
    
}
