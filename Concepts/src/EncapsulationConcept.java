public class EncapsulationConcept {
    public static void main(String[] args) {
        Home obj = new Home();
        obj.setAge(10);
        System.out.println(obj.getAge());

        car mycar = new OnCar();
        mycar.jain();
        mycar.jilly();
        mycar.simple();

        classA obj1 = new b();

        obj1.dinner();
        obj1.lunch();

    }

}
class Home{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
}

abstract class car{
    public abstract void jain();

    public abstract void jilly();

    public void simple(){
        System.out.println("This is Abstract Class Method");
    }
}

class OnCar extends car{

    static {
        System.out.println("This is Static Keyword Example... ");
    }

    public void jain() {
        System.out.println("This is Abstract Jain Method ... ");
    }

    public void jilly(){
        System.out.println("This is Abstract Jilly Method  .... ");
    }

}
interface classA{
    String Name = "Peddireddy";
    int age = 23;

    void lunch();
    void dinner();
}

class b implements classA{

    public void lunch(){
        System.out.println("Taking you for Lunch .... ");
    }

    public void dinner(){
        System.out.println("Taking you for Dinner .... ");
    }

}