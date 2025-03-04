public class allLearnings {
    public static void main(String[] args) {
//        Test obj = new Test();
//        obj.m1();
//        obj.m2();

        int j = 0;

        while(j<10){
            System.out.println("Implement status : " + j);
            j++;
        }

        int  x1 = 5;
        int y1 = 10;
        int z = (x1++ > 5 && y1-- < 10) ? x1-- : y1;
        System.out.println(z);
    }
}

class Test{
    public static int i = 0;

    Test(){
        i++;
    }

    public int m1(){
        System.out.println("This is method 1 : ");
        this.m2();
        return 1;
    }

    public void m2(){
        System.out.println("This is inside m2 method : ");
    }
}

