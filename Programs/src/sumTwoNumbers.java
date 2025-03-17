public class sumTwoNumbers {
    public static void main(String[] args) {
        String x = "01";
        String y = "10";
        System.out.println(x+y);
        int x1 = Integer.parseInt(x,2);
        int y1 = Integer.parseInt(y,2);

        System.out.println(x1+" "+y1);

        int c1 = x1+y1;
        String c2 = Integer.toBinaryString(c1);
        System.out.println("To Binary Statement ...  " + c2);

        /*
        Converting string to integer we can do multiple ways
        1: Integer.parseInt("Pass String Value")
        2:
         */

        String num1 = "123";
        int num2 = Integer.parseInt(num1);
        System.out.println(num2+123);

        String num3 = Integer.toString(num2);
        System.out.println(num3);

        int num4 = num1.charAt(1);
        System.out.println(num4);
    }
}
