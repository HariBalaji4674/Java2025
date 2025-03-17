import java.util.Arrays;

public class recursionJava {
    /*
    Recursion:
    - When a function calls itself until a special condition is met
    -  Segmentation Faulty : Numerous functions are waiting in stack is called stack overflow
    - Stack Space :  where the non executed functions are stored
    - Recursion Tree
    -
     */
    public static void main(String[] args) {

        m1();
        int num = m4(5);
        System.out.println(num);

        name(0,5);
        name1(0,5);

        low(10,0);

        summation(10,0);

        int nums = summations(10);
        System.out.println("The value is : " + nums);


        int arr[] = {4,8,3,7,5,2};
        System.out.println("Before Swap Function ... ");
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length-1;
        swapArray(arr,left,right);

        System.out.println("After Swap Function ... ");
        System.out.println(Arrays.toString(arr));


    }

    static void m1(){
        System.out.println("Hari Vardhan");
        m2();

    }
    static void m2(){
        System.out.println("Peddireddy");
        m3();
    }
    static int m3(){
        return 0;
    }

    static int m4(int n){
        if (n <= 0){
            return 1;
        }
        return n * m4(n-1);
    }
    static void name(int i,int n){
        if(i > n){
            return ;
        }
        System.out.println("Hari");
        name(i+1,n);
    }
    static void name1(int i,int n){
        if(i > n){
            return ;
        }
        System.out.println(i);
        name1(i+1,n);
    }
    static void low(int n,int i){
        if(n<i){
            return ;
        }
        System.out.println(n);
        low(n-1,i);
    }
    static void summation(int i,int sum){
        System.out.println(sum);
        if (i < 1){

            return ;
        }
        summation(i-1,sum+i);
    }

    static int summations(int i){
        int sum;
        if(i > 0){
            return i + summations(i-1);
        }
        return 0;
    }

    static void swapArray(int arr[],int left,int right){
        if(left >= right){
            return ;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        swapArray(arr,left+1,right -1);
    }

}


