public class constructorJava {

    public static void main(String[] args) {
        System.out.println("Peddireddy");
//        red r1 = new red();
        greeen g1 = new greeen();


    }
}
class red{
    public red(){
        System.out.println("Printing Red Color ...");
    }
}
class blue extends red{
    public blue(){
        System.out.println("Printing Blue with Red Mix ... ");
    }
}
class greeen extends blue{
    public greeen(){
        System.out.println("Printing Green with red blue");
    }
}
/*
Packages

Access Modifiers

Polymorphism

Final Keyword

Dynamic Method Dispatch

Object Class equals to String hashcode

Type Casting:

Upcasting and Downcasting

Wrapper Classes
Integer
Float
Double
String
Char = Character

 */



