package Lecture21(HigherOrderFunction)(23July;

import java.util.*;
import java.util.function.Function;

interface Hof {
    ArrayList<Integer> square(Function<Integer, Integer> f, List<Integer> l);
}

public class HofExample1 {
    public static void main(String[]args){
        Function<Integer, Integer> f = (x) -> x * x;
        List<Integer> l = Arrays.asList(1,7,2,5,2,10);
        HofExample1 hof = new HofExample1();
        System.out.println(h1.square(f,l));
    }
    public ArrayList<Integer> square(Function<Integer, Integer> f, List<Integer> l) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (Integer a : l) {
            ar.add(f.apply(a));
        }
        return ar;
    }
}
