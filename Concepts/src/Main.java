public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /*
        Implementation of an array
        Multi-dimensional Array
        nums[][] array = new array[][];

        Jagged Arrays

        Draw Backs for an array:
        arrays will take memory in heap storage

        exceptions will show error in run time  not at compile time
         */
        int nums[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random()*10);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }

        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(nums[i][j]+ " ");
            }
            System.out.println(" ");
        }

        for(int[] n:nums){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println(" ");
        }

        int num[][] = new int[3][];

        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[2];

        for(int i=0;i< num.length;i++){
            for(int j =0;j<num[i].length;j++){
                num[i][j] = (int)(Math.random()*10);
                System.out.print(num[i][j]+" ");
             }
            System.out.println(" ");
        }

        for(int[] n : num){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println(" ");
        }

        /*
        Array of objects
         */

        Students s1 = new Students();
        s1.name = "peddireddy";
        s1.age = 23;
        s1.marks = 45;

        System.out.println(s1.name+" : "+ s1.age+" : "+ s1.marks);



    }


}

class Students{
    String name = "";
    int age = 0;
    int marks = 0;
}