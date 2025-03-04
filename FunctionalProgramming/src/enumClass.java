public class enumClass {
    public static void main(String[] args) {
        System.out.println("Enum Class ... ");
        day d = day.thursday;

        if(d == day.friday){
            System.out.println("Weekend Starts ... ");
        }
        else{
            System.out.println("Weekend ends .... ");
        }

        Size size = Size.LARGE;

        if(size == Size.LARGE){
            System.out.println("This is Soo Expensive ...");
        } else if (size == Size.MEDIUM) {
            System.out.println(" This is medium Size ... ");
        } else{
            System.out.println(" This is Small Size ... ");
        }

        switch(d) {
            case thursday -> System.out.println("Today Is Thursday  .... ");
        }
    }
}

enum day{
    monday,truesday,thursday,wednessday,friday,saturday,sunday
}
enum Size{
    SMALL(30),MEDIUM(40),LARGE(50);

    private int price;

    Size(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}
