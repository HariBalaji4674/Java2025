import InterfacesJava.FifthFun;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.function.BiFunction;
import java.util.function.Function;

public class OderClass {
    public static void main(String[] args) {
        FifthFun<Integer,Integer,Integer,Integer,Integer,Integer,Integer> apple = (a,b,c,d,e,f) -> a+b+c+d+e+f;
        System.out.println(apple.apply(10,20,30,40,50,60));

        BiFunction<Integer,Integer,Integer> twice = myMath.multiple();
        BiFunction<Integer,Integer,Integer> thrice = myMath.multiple();
        BiFunction<Integer,Integer,Integer> four = myMath.multiple();
        BiFunction<Integer,Integer,Integer> five = myMath.multiple();

        System.out.println(twice.apply(2,2));
        System.out.println(thrice.apply(2,3));
        System.out.println(four.apply(2,4));
        System.out.println(twice.apply(2,5));

    }

    protected static class myMath{
        public static BiFunction<Integer,Integer,Integer> multiple() {
            return (x,y) -> x * y;
        }
    }
}
