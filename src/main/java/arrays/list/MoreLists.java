package arrays.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"Apples","Oranges","Bananas","Grapes"};
        List<String> list = List.of(items);

        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Avocado");
        System.out.println(groceries);
        ArrayList<String> nextlist = new ArrayList<>(
                List.of("Yogurt","Milk","Treetomatoes")
        );
        groceries.addAll(nextlist);
        System.out.println(groceries);

        System.out.println("Third element in the list is "+ groceries.get(2));
        if(groceries.contains("Oranges")){
            System.out.println("List contains Oranges");
        }
        groceries.add("Melon");
        groceries.add("Oranges");
        System.out.println(groceries);
        System.out.println("First index of Oranges is "+groceries.indexOf("Oranges"));
        System.out.println("Last index of Oranges is "+ groceries.lastIndexOf("Oranges"));
        System.out.println("Removing==========================");
        groceries.remove(2);
        System.out.println(groceries);
        groceries.remove("Oranges");
        System.out.println(groceries);
        groceries.removeAll(List.of("Milk", "Treetomatoes"));
        System.out.println(groceries);
        groceries.retainAll(List.of("Apples", "Grapes", "Avocado", "Yogurt", "Melon"));
        System.out.println(groceries);
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty "+groceries.isEmpty());

        groceries.addAll(List.of("Apples", "Grapes", "Avocado", "Yogurt", "Melon"));
        groceries.addAll(Arrays.asList("Yogurt","Milk","Treetomatoes"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
