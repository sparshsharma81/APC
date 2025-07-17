package APC.Lecture17;

import java.text.Annotation;

import jdk.incubator.vector.VectorOperators.Test;

(Custom_Annotations)(17july).annotation;

public class Test1 {
    public static void main(String args[]){
        Test t = new Test();
        System.out.println(t.model);
        Class obj = t.getClass(); //t.getclass se uski saari class call ho jayegi
        Annotation a = obj.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone)a;
        System.out.println(s.calling());
        System.out.println(s.version());
        


    }
}
