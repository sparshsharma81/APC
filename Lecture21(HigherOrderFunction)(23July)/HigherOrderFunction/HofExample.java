import java.util.ArrayList;

public class HofExample{
    public static void main(String args[]){
        HOFExample hof = new HofExample();
        hof.print(() -> System.out.println("Hello World"));
        Interf i = () -> System.out.println("m1() method is called");
        i.m1();
        // i.m1();
        // Function<Integer, Integer> i = (x) -> x * 2;
        // System.out.println("Double of 5: " + doubleFunction.apply(5));
    }
    public static void print(Inter f){
        System.out.println("Hello, this is a higher-order function example.");
    }
    public static int doubleValue(int x, ArrayList<Integer> list) {
        int result = x * 2;
        list.add(result);
        return result;
    }
    public static int sqaure((x)->x*x){
        return x * x;
    }
    public static int add(int a, int b) {
        return a + b;
    }
}