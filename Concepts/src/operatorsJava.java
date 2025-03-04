public class operatorsJava {
    public static void main(String[] args) {
        /*
        Operators
        - special symbols to perform operations on variables and values
        -
        arithmetic Operators
        addition subtraction multiplication division
        logical
        relational
        bitwise

        Primitive and non-primitive data types
        arithmetic operators are used to perform simple arithmetic operations
        + : addition
        *: multiplication
        % modulus
        - subtraction

        = mean assignment operator
        == equal operator
        != not equal to
        >= greater than equal to
        <= less than equal to


         */

        int num1 = 200;
        int num2 = 300;
        System.out.println(num1+num2);
        System.out.println(num2-num1);

        int number1 = 10;
        int number2 = 45;
        int number3 = 5;
        int number4 = 3;

        int addition = number1+number2;
        int subtraction = number2 - number3;
        int multiplication = number4*number3;
        int modulo1 = number4%number3;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(modulo1);

        /*
        Post Increment
        Pre Increment
         */

        int a = 10;

        System.out.println("Post Increment "+ a++);
        System.out.println("PreIncrement "+ ++a);

        int b = 10;
        System.out.println("Post Decrement "+ b--);
        System.out.println("Pre Decrement "+ --b);

        boolean result = a >= b;
        System.out.println(result);


        /*
        assignment Operators

        += add and assign
        -+ sub and assign
        *= multiply and assign
        /= Divide and assign
        %= Modulo and assign
         */

        int a1 = 200;
        int b1 = 300;

        a1 += a1;
        System.out.println("Output "+ a1);

        b1 *=b1;
        System.out.println("Output "+ b1);

        b1 %= a1; // Modulo wil give remainder
        System.out.println("Modulo Operators is "+ b1);


        /*
        Left shift operator
        Right Shift Operator
         */
        int f = 2;
        System.out.println("f << 2 : " + (f <<= 2));
        System.out.println("f >> 2 : " + (f >>= 2));
        System.out.println("f >>> 2 : "+ (f >>>= 2));
        System.out.println("f <<< 2 : "+ (f >>= 8));

        /*
        relational Operators
        == != < <= >=
         */
        int num3 = 10;
        int num4 = 20;
        int num5 = 30;

        System.out.println(" num3 === num4 :" + (num3==num4));
        System.out.println("num4 > num5 : "+ (num4>num5));

        boolean x = true;
        boolean y = false;
        System.out.println(" x && y : " +(x && y));
        System.out.println(" x || y : " + (x || y));
        System.out.println(" !x :" + (!x));
        System.out.println(" !y : "+ (!y));

        /*
        Bitwise Operators
        &
        |
        ^
        ~
         */

        int d = 0b1010 ; // 10
        int e = 0b1100 ; // 12

        int g = 34;
        int h = 24;


        System.out.println(" d & e : " + ( d & e));
        System.out.println(" d | e : "+ (d | e));

        System.out.println(" g & h : " + (g & h));
        System.out.println(" g | h : " + ( g | h));
        /*
        Conditional Statements
        if
        else
        else if
        ternary : var name = n%2 == 0 ? 2 : 3
         */

        int num6 = 21;

        boolean result3 = num6%2 == 0? true : false;
        System.out.println(result3);
/*
switch statements
int num = 9
switch(n){
case 1:
    System.out.println("true");
 */
        int num7 = 3;

        switch (num7){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default :
                System.out.println("please enter valid number ");
        }

        /*
        nested if statements
        */
        int num8 = 20;

        if(num8 >10){
            if (num8 %2 == 0){
                System.out.printf("%d is a prime number \n " ,num8);
//                System.out.println("\n");
            }
            else {
                System.out.println("Please re-verify the number ");
            }
        }
        else{
            System.out.println("Out of statements !!! Please re-enter the number");
        }

        /*
        for loop and enhanced for loop
        for ( initialization; condition; increment / decrement)
         */
        for(int i = 0;i < 10;i++){
            System.out.printf("%d ",i);
        }
        System.out.println("\n");
        int []arr = {2,3,4,5,6,7,10,30};
        for (int i:arr){
            System.out.printf("%d ",i);
        }
        System.out.println("\n");

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print("( "+i+" "+j+" )");
            }
            System.out.println();
        }

        /*
        finding max number with two methods
         */
        int []mark = {20,30,50,12,45,83,34,66,9,23,56};

        int max = findMax(mark);
        System.out.println("Max Number is : "+max);

        /*
        multiplication array
         */
        int array[] = {1,2,3,4,5,6,7,8,9};
        for (int num:array){
            int nu[] = {};
            num = num * 2;
//            nu = nu[num+1];
            System.out.print(num+" ");
        }
        int c = 0;
        while(c <10){
//            c++;
            System.out.println(c);
            c++;
        }
        operatorsJava obj = new operatorsJava();
        obj.sumArray(mark);

        obj.message();

        obj.sumNum(20,30);
        test obj1 = new test();
        int sum = obj1.addInt(30,30);
        System.out.println(sum);

    }

    public static int findMax(int[] n){
        int maximum = n[0];

        for(int number : n){
            if(number > maximum){
                maximum = number;
            }
        }
        return maximum;
    }
    void sumArray(int[] n){
        int sum = 0;
        for(int num : n){
            sum = sum + num;
            System.out.println("Sum of an elements " + sum);
        }
    }

    public void message(){
        System.out.println("Peddireddy Hari Vardhan Reddy");
    }

    public void sumNum(int a,int b){
        int sum = a +b ;
        System.out.println(sum);
    }
}
class test{
    int i = 0;
    public int addInt(int i ,int j){
        int sum = i+j;
        return sum;
    }
    test(){
        i++;
    }
}
