public class linearSearch {
    public static void main(String[] args) {
//        int nums[] = {1,2,3,4,5,6,7,8,9};
        int nums[] = new int[10000];
        int target = 3;
        int root = linearsearch(nums,target);

        if(root != -1)
            System.out.println("Root value :"+ root);
        else
            System.out.println("Element Not Found  .. ");

//        int root1 = binarySearch(nums,target,0,0);
//        System.out.println(root1);

    }
    public static int linearsearch(int []nums,int target){

        int steps = 0;
        for(int i = 0;i<=nums.length-1;i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps Taken Linear Search : "+ steps);
                return target = i;
            }
        }
        System.out.println("Steps Taken Linear Search : "+ steps);
        return -1;
    }
//    public static int binarySearch(int []nums,int target,int left,int right){
//        // 3,4,1,7,8,9,4
//        left = 0;
//        right = nums.length -1 ;
//        int steps = 0;
//
//        while(left <= right) {
//            steps++;
//            int mid = (right+left)/2;
//
//            if (nums[mid] == target) {
//                System.out.println("Steps Taken : "+ steps);
//                return mid;
//            } else if (nums[mid] < target) {
//                return binarySearch(nums,mid,mid+1,right);
//            } else {
//                return binarySearch(nums,mid,left,mid-1);
//            }
//        }
//        System.out.println("Steps Taken : "+ steps);
//        return -1;
//    }
}
