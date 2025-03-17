public class SwappingJava {
    public static void main(String[] args) {
        System.out.println("Swapping Java Class ....");

        int n1 = 2;
        int n2 = 210;

        int temp = 0;

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("n1 : " + n1 +" : n2 : "+ n2);

//        n1 = n1^n2;
//        n2 = n1-n2;
//        n1 = n1-n2;

        System.out.println("n1 : " + n1 +" : n2 : "+ n2);

        n1 = n1 - n2;
        n2 = n1 + n2;
        n1 = n2 - n1;

        System.out.println("n1 : " + n1 +" : n2 : "+ n2);


        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;

        System.out.println("n1 : " + n1 +" : n2 : "+ n2);

        n1  = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("n1 : " + n1 +" : n2 : "+ n2);

    }
}
