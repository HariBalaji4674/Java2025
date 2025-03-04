import java.util.*;
import java.util.stream.Stream;

import static java.lang.reflect.Array.set;

public class collectionInterfaces {
    public static void main(String[] args) {
        System.out.println("Collections API and Interfaces ");
        /*
        Collection API
        - We have 2 types
          - Collection Interface
            - Contains
              - ArrayList
              - Set
              - Queue
              - Maps
          - Collections Class
            - Contains
              - add
              - remove
              - append
              - sort
              - etc..
         */
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        for(Object num :nums){
            int nu = (Integer) num;
            System.out.println(nu * 2);
        }
        ArrayList<String> names = new ArrayList<String>();
        names.add("Peddireddy");
        names.add("Vardhan");
        names.add("Hari");
        names.add("Reddy");
        names.add("Reddy");
        names.add("Vardhan");
        names.add("Reddy");

        System.out.println(names);

//        List list1 = (x) -> names.size() > 10;
        int num1 = names.size();
        System.out.println(num1);

        for(String name : names){
            System.out.println(name.length()>7);
        }
        for(String name : names){
            System.out.println(name);
        }

        Collection<String> strings = new HashSet<String>();

        strings.add("Hri");
        strings.add("Hri");
        strings.add("Hari");
        System.out.println(strings);

        Map<String,Integer> maps = new HashMap();
        maps.put("Hari",25);
        maps.put("Vardhan",45);
        maps.put("Reddy",56);
        System.out.println(maps);

        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8);

        Stream<Integer> s1 = numbers.stream();
        System.out.println(s1);

        s1.forEach(n -> System.out.println(n));

        List<Integer> number1 = Arrays.asList(10,20,30,40,50,60);

        Stream<Integer> st1 = number1.stream();
        st1.forEach(n -> System.out.println(n));
    }
}
