import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class throwKeyword {
    public static void main(String[] args) throws IOException {
        int i = 20;
        int j = 0;

        try {
            j = 10/j;
            if (j == 0){
                throw new ArithmeticException("Not Divisible By Zero : ...");
            }
        }
        catch(Exception e){
            System.out.println("Exception as e : "+ e);
        }

//        int age = 13;
//        if(age < 18){
//            throw new IllegalArgumentException("Age must be a greater that 18: ...");
//        }
//        System.out.println("You are Eligible ");


        try{
            if ( j <= 0){
                throw new HariException("This is Hari Exception that number will not be zero ... ");
            }
        }
        catch(HariException e) {
            System.out.println(e);

        }
        InputStreamReader in = new InputStreamReader(System.in);

        BufferedReader bf = new BufferedReader(in);
        System.out.print("Please eneter the number :  ");
        int num = Integer.parseInt(bf.readLine());

        System.out.println(num);
    }

}
class HariException extends Exception{
    public HariException(String string){
        super(string);
    }
}



