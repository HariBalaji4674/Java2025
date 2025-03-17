public class multipleRecursioncalls {
    public static void main(String[] args) {
        System.out.println("Happy Birthday Hari Vardhan Reddy .... ");
        System.out.println(mulCalls(30));
        int arr[] = {2,3,2,3,2,3,2,2,2};
        System.out.println(cunt(arr));
    }

    static int mulCalls(int num){
        if(num <= 1){
            return num;
        }
        int sFirst = mulCalls(num-1); // 4-1,3-1,2-1,1-1
        int sLast = mulCalls(num-2); // 4-2 2-2
        return sFirst + sLast;
    }
    /*
    count the repeated numbers .....
     */
    static int cunt(int []arr){

        int count = 0;
        int target = 2;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }

    static int numc(int arr[]){

        int search1 = 2;
        int search2 = 3;
        int search3 = 4;

        for(int i = 0;i<arr.length-1;i++){
            if( arr[i] == search1 || arr[i] == search2 || arr[i] == search3) {

            }
        }
        return 0;

    }
}
