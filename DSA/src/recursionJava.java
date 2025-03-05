public class recursionJava {
    /*
    Recursion:
    - When a function calls itself until a special condition is met
    -  Segmentation Faulty : Numerous functions are waiting in stack is called stack overflow
    -
     */
    public static void main(String[] args) {;
        m1();
    }
    static int m1(){
        int count = 0;
        if(count == 3) {
            System.out.println("Hello Hari !!!!");
            count++;
        }
        else {
            return m1();
        }
        return -1;
    }

}
