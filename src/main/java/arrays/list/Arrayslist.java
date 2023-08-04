package arrays.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayslist<G> {
    record GroceryItem(String name, String type,int count){
        GroceryItem(String name){
            this(name,"DAIRY",1);
        }
    }
    public static void main(String[] args) {
      GroceryItem[] groceryArray = new GroceryItem[3];
      groceryArray[0] = new GroceryItem("milk");
      groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
      groceryArray[2] = new GroceryItem("oranges","PRODUCE",5);
      System.out.println(Arrays.toString(groceryArray));

        ArrayList objectlist = new ArrayList<>();
        objectlist.add(new GroceryItem("Butter"));
        objectlist.add("Yogurt");

        ArrayList<GroceryItem> glocerylist = new ArrayList<>();
        glocerylist.add(new GroceryItem("Butter"));
//        glocerylist.add("Yogurt");
    }
}
