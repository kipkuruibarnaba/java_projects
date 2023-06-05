package billsburgerchallenge;

public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink","coke",1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping","avocado",1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular ",4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder mealOrder = new MealOrder();
//        mealOrder.addBurgerToppings("BACON","CHEESE","MAYO");
//        mealOrder.setDrinkSize("LARGE");
//        mealOrder.printItemizedList();

        MealOrder secondmealOrder = new MealOrder("turkey","7-up","chili");
        secondmealOrder.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        secondmealOrder.setDrinkSize("SMALL");
        secondmealOrder.printItemizedList();
    }
}
