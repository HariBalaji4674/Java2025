import java.util.Arrays;

public class binarySearchJava {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};
//        int arr[] = new int[10000];
        int len = arr.length;
        System.out.println(len);
        int target = 4;
        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)/2;
        System.out.println("Middle Element : "+ mid);
        System.out.println("Element To be searching : "+ target);

        int result = binarySearchClass(arr,target);
        if( result != -1){
            System.out.println("Element Found at Index : "+ result);
        }
        else{
            System.out.println("Element Not Found ...");
        }
//        System.out.println(result);

    }
    public static int binarySearchClass(int[] nums, int target){
        int steps =0;
        int left = 0;
        int arrays[] = Arrays.stream(nums).sorted().toArray();
        int right = arrays.length-1;
        while(left <= right){
            steps++;
            int mid = (left+right)/2;
            System.out.println("Middle element : "+ mid);
            if(arrays[mid] == target){
                System.out.println("Steps Taken : "+steps);
                return  mid;
            } else if (arrays[mid] < target) {
                return left = mid+1;

            }else{
                return right = mid-1;
            }
        }
        System.out.println("Steps Taken : "+steps);
        return -1;

    }
}

