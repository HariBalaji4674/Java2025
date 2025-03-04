public class typeConversion {
    public static void main(String[] args) {

        /*
        Type Conversion and Casting
        Type promotion
        small to big is compatible
        big to small is not compatible

        byte --> short --> int --> long --> float --> double

        1 byte  = 8 bits

        byte = 8 bits
        char = 16 bits
        int = 32 bits
        long = 64 bits
        double = 64 bits
        float = 32 bits

         */
        float f = 5.7f;
        int a = (int)f;
        System.out.println(a);

        int b = 257;
        System.out.println(b);

        int i = 20;
        float f1 = 200.456f;
        double d = 3456789784d;
        System.out.println(i +" "+f1 +"  "+d);

        char ch = 'A';
        int num = 23;
        int nu = (int) ch;
        System.out.println(nu);
        System.out.println(ch);

        double d1 = 324657.74834d;
        System.out.println(d1);
        long l1 = (long) d1;
        System.out.println(l1);

        int nu1 = 65;
        char c1 = (char) nu1;
        System.out.println(c1);

        float f2 = 2347.987f;
        System.out.println(f2);

        int n2 = (int) f2;
        System.out.println(n2);

        float f3 = n2;
        System.out.println(f3);



//        505218902720


    }
}
