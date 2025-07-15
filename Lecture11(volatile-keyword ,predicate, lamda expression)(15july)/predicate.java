import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
public class predicate{
    public static void main(String args[]){
        Predicate<String> j = (c)->(c.length()>3);
        String s = "::abc";
        System.out.println(j.test(s));
        Predicate<Integer> j1 = (c)->(c>0 && c%5==0);
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(j1.test(n));
        Function<Integer,String> p = (s) ->s.length();
        p.apply(1,"abcd");
    }
}