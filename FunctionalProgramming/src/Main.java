import InterfacesJava.FifthFun;
import InterfacesJava.NOArgFunction;
import InterfacesJava.TriFunction;

import javax.swing.*;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Function<Integer,Integer> myTriple = myMath::triple;
        Integer result = myTriple.apply(10);
        System.out.println(result);

        Function<Integer,Integer> value = (x) -> (x < 0) ? -x : x ;
        System.out.println(value.apply(-100));

        BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
        System.out.println(add.apply(20,40));

        TriFunction<Integer,Integer,Integer,Integer,Integer> sumA = (x, y, z, a) -> x+y+z+a;
        System.out.println(sumA.apply(10,20,30,40));

        NOArgFunction<Integer> Number = () -> 345;
        System.out.println(Number.apply());

        final Boolean isDevelopment = true;
        DataLoader dataloader = new DataLoader(isDevelopment);
        System.out.println(dataloader.loadPerson.apply());

        mMath Mmath = new mMath();
        System.out.println(mMath.combine2And3(mMath::add));
        System.out.println(mMath.combine2And3(mMath::sub));

        Function<Integer,Integer> twoMultiple = math1.MyMultiple(2);
        Function<Integer,Integer> threeMultiple = math1.MyMultiple(3);
        Function<Integer,Integer> fourMultiple = math1.MyMultiple(4);

        System.out.println(twoMultiple.apply(2));
        System.out.println(threeMultiple.apply(3));
        System.out.println(fourMultiple.apply(4));


        FifthFun<Integer,Integer,Integer,Integer,Integer,Integer,Integer> fifth = (a,b,c,d,e,f) -> a+b+c+d+e+f;
        System.out.println(fifth.apply(10,20,30,40,50,60));

    }

    protected static class myMath{
        public static Integer triple(Integer x){
            return x*3;
        }
    }

    protected static class person{
        private Integer age;
        private String name;

        public person(String name,Integer age){
            this.age = age;
            this.name = name;

        }
    }

    protected static class DataLoader{

        public final NOArgFunction<person> loadPerson;

        public DataLoader(Boolean isDevelopment){
            this.loadPerson = isDevelopment
                    ? this::loadPersonFake
                    : this::loadPersonReal;

        }
        private person loadPersonReal(){
            System.out.println("Loading Real Person Details : ");
            return new person("Real Person",24);
        }
        private person loadPersonFake(){
            System.out.println("Loading Fake Person Details : ");
            return new person("Fake Person",30);
        }
    }

    protected static class mMath{

        public static Integer add(Integer x, Integer y){
            return x+y;
        }
        public static Integer sub(Integer x, Integer y){
            return x-y;
        }
        public static Integer combine2And3(BiFunction<Integer,Integer,Integer> combineFunc){
            return combineFunc.apply(5,4);
        }

    }

    protected static class math1{
        public static Function<Integer,Integer> MyMultiple(Integer y) {
            return (Integer x) -> x * y;
        }
    }

}

/*
Lambda Expressions
()-> someArg *2 + 1;

 */