package Lecture21(HigherOrderFunction)(23July).HOF-functional-interface;



public class HofExample {
    public static void main(String[] args) {
        
        interf i = () -> System.out.println("Hello World");
        print(i);
        // i.m1();
    }
    public static void print(interf i) {
        i.m1();
        System.out.println("Hello, this is a higher-order function example.");
        // i.m1();
    }
}
