public class selectionSortJava {
    public static void main(String[] args) {
        System.out.println("Selection Sorting .... ");

        int nums[] = {9,4,5,3,7,8,2};
        System.out.println("Before Sorting ...");

        for(int num: nums){
            System.out.print(num + " ");
        }


        /*
        Selection Sort Logic starts

         */
        int temp = 0;
//        int maxIndex = 0;
        int size = nums.length;
        for(int i =0;i<size-1;i++){
            int maxIndex = i;
            for(int j=i;j<size;j++){
                if(nums[maxIndex] > nums[j]){
                    maxIndex = j;
                }
            }
            temp =  nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;
        }


        System.out.println();

        System.out.println("After Sorting ...");

        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}
