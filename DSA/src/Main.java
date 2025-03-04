public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*
        Linear Search :
         */
        int arrays[] = {1,2,3,5,8,9,10,14,19};
        int target = 8;
        int result = linearsearch(arrays,target);
        if(result != -1){
            System.out.println("Element was found at Index at :  "+ result);
        }
        else
        {
            System.out.println("Element is not found .... ");
        }
    }
    public static int linearsearch(int []nums, int target){

        for (int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

}