public class BubbleSortingJava {
    public static void main(String[] args) {
        System.out.println("Bubble Sorting ...\n ");

        int nums[] = {9,8,7,6,5,4,3,2,1};
        int temp = 0;
        int size = nums.length;
        System.out.print("Before sorting : ");
        for(int num :nums){
            System.out.print(num + " ");
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
        System.out.println();
        System.out.println("After sorting : ");
        for(int num :nums){
            System.out.print(num + " ");
        }
    }
}
