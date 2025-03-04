public class threadClass {
    public static void main(String[] args) throws InterruptedException {
            a o1 = new a();
            b2 o2 = new b2();
            o1.start();
            Thread.sleep(5);
            o2.start();

            addition add = message -> System.out.println("Message : " + message);

//            addition add1 = (int x,int y) -> System.out.println(x+y);
//            addition adds = new addition();

            add.greet();
            add.print("Hello world ");
            addition.show();
//            addition.addi(20,30);

    }
}

class a extends Thread{
        public void run(){
          for(int i=0;i < 100;i++){
            System.out.println("This is 1 .... "+ i);
        }
    }
}
class b2 extends Thread {
        public void run(){
            for(int i=0;i<100;i++){
            System.out.println("This 2 ... "+i);
        }
    }
}

@FunctionalInterface
interface addition{
    void print(String message);

    static void show(){
        System.out.println("Printing Static Methods ... ");
    }
    default void greet(){
        System.out.println("Printing Default Message .... ");
    }
    default int addi(int x,int y){
        int sum = x + y * (x+y);
        return sum;
    }
}