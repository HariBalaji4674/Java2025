import java.util.Scanner;

public class OopsClasses {
    public static void main(String[] args) {

        calculator calc = new calculator();
        int result = calc.sum(20,30);
        System.out.println(result);
        int arr[] = {1,2,3,4,5};
        System.out.println(arr[1]);

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("My name is : " + name);

    }
}
class calculator {
    public int sum(int nu1 , int nu2){
        int sum = nu1+nu2;
        return sum;


    }
}