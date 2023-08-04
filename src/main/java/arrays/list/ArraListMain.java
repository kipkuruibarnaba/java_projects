package arrays.list;

import java.util.ArrayList;
public class ArraListMain {
    record GroceryItem(String name,String type,int count){
        public GroceryItem(String name){
            this(name,"DAIRY",1);
        }
        @Override
        public String toString(){
            return String.format("%d %s in %s",count,name.toUpperCase(),type);
        }
    }
    public static void main(String[] args) {
//       Object[] gloceryArray = new Object[3];
//       gloceryArray[0] = new GroceryItem("MILK");
//       gloceryArray[1] = new GroceryItem("APPLES","PRODUCE",6);
//       gloceryArray[2] = "5 Oranges";
//       System.out.println(Arrays.toString(gloceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");
//        System.out.println(Arrays.toString(objectList));
        ArrayList<GroceryItem> grocerylist = new ArrayList<>();
        grocerylist.add(new GroceryItem("Butter"));
        grocerylist.add(new GroceryItem("Yogurt"));
        grocerylist.add(new GroceryItem("Oranges","Produce",5));
        grocerylist.set(0,new GroceryItem("Apples","Produce",5));
        grocerylist.remove(1);
//        grocerylist.add(0,new GroceryItem("Apples","Produce",5));
        System.out.println(grocerylist);

    }
}