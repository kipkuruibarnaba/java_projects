package billsburgerchallenge;

public class DeluxeBurger extends Burger{
    Item duluxe1;
    Item duluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }


    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        duluxe1 = new Item("TOPPINGS",extra4,0);
        duluxe2 = new Item("TOPPINGS",extra5,0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(duluxe1 != null){
            duluxe1.printItem();
        }
        if(duluxe2 != null){
            duluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }

}
