import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class parallelStreamClass {
    public static void main(String[] args) {
        System.out.println("Parallel Stream Class ... ");
        int size = 1000;
        List<Integer> nums = new ArrayList<>(size);
        Random ran = new Random();
        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt(100));
        }
        System.out.println(nums);

        long sum1 = nums.stream()
                .filter(i -> i%2 == 0)
                .count();

        System.out.println(sum1);

        int sum2 = nums.stream()
                .map(i -> i*2)
                .reduce(0,(c,e)-> c+e);

        System.out.println(sum2);

        int sum3 = nums.stream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum3);
        /*
        How predicate works:
        - Represents a condition
        - used for filtering,validation,conditional checks in streams,collections,lambda expression etc.
        - @FunctionalInterface
          public interface Predicate<T>{
          boolean test(T t);
        - Predict the value it is true or false
         */
        Predicate<Integer> isEven = num -> num%2 == 0;
        isEven.test(4);

        int sum4 = nums.parallelStream()
                .map(n -> {
                    try{
                        Thread.sleep(1);
                    }catch (Exception e){

                    }
                        return n *2;
                })
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum4);

        List<Integer> list = new ArrayList<>();
        Set sum5 = nums.stream()
                .filter(n -> n*2 != 0)
                .collect(Collectors.toSet());

        System.out.println(sum5);
    }
}






























