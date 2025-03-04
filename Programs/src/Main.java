import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        /*
        User Input
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Number You want : ");
        int num = sc.nextInt();
        System.out.println("You have Entered The number : "+num);
//        sc.close();

        /*
        Using Buffered reader to Read Data from User
         */
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        System.out.print("Please enter the name : ");
        String num3 = bf.readLine();
        System.out.println("Your name is : " +num3);

        /*
        Scanner Class
         */
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Please Enter My one number : ");
        int number1 = sc1.nextInt();
        System.out.println("Entered Number is: "+ number1);



    }
}