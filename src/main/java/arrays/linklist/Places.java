package arrays.linklist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Places {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesTovisit =new LinkedList<String>();
        placesTovisit.add("Nairobi");
        placesTovisit.add(0,"Kampala");
        addMoreElements(placesTovisit);
        System.out.println(placesTovisit);
        removeElements(placesTovisit);
        System.out.println(placesTovisit);
        gettingElements(placesTovisit);
        printItinerary(placesTovisit);
        printItinerary2(placesTovisit);
        printItinerary3(placesTovisit);
        testIterator(placesTovisit);
        testListIterator(placesTovisit);
        System.out.println(placesTovisit);
    }
    public static void addMoreElements(LinkedList<String> list){
        list.addFirst("NewYork");
        list.addLast("London");
        list.offer("Melbourne");
        list.offerLast("Paris");
        list.offerFirst("Madrid");
        list.push("Naivasha");
        list.push("Zanzibar");
        list.push("HongKong");
    }
    public  static void removeElements(LinkedList<String> list){
        list.remove(3);
        list.remove("London");
        System.out.println(list);
        String item = list.remove();  //remove first element
        System.out.println(item+ " was removed");

        String item2 = list.removeFirst();  //remove first element
        System.out.println(item2+ " was removed");

        String item3 = list.removeLast();  //remove last element
        System.out.println(item3+ " was removed last");

        String item4 = list.poll();  //remove first element
        System.out.println(item4+ " was removed");
        String item5 = list.pollFirst();  //remove first element
        System.out.println(item5+ " was removed");

        String item6 = list.pollLast();  //remove last element
        System.out.println(item6+ " was removed");

        System.out.println(list);

        String item7 = list.pop();  //remove first element
        System.out.println(item7+ " was removed");

    }
    public static void gettingElements(LinkedList<String> list){

        list.push("Chad");
        list.add("Addis Ababa");
        list.push("Sudan");
        list.push("Beijin");
        list.push("Kuwait");
        System.out.println("Availlable Places = "+ list);
        System.out.println("Retrieved Element = "+ list.get(1));
        System.out.println("Retrieved First = "+ list.getFirst());
        System.out.println("Retrieved Last = "+ list.getLast());
        System.out.println("Nairobi is at position = "+ list.indexOf("Nairobi"));
        System.out.println("Addis Ababa is at position = "+ list.lastIndexOf("Addis Ababa"));
        //Queue retrieval methods
        System.out.println("Element from element() "+list.element());
        //Stack retrieval method
        System.out.println("Element from peek() "+list.peek());
        System.out.println("Element from peekFirst() "+list.peekFirst());
        System.out.println("Element from peekLast() "+list.peekLast());

    }
    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip starts at "+list.getFirst());
        for (int i =1;i<list.size();i++){
            System.out.println("-- > From "+list.get(i-1)+" to "+list.get(i));
        }
        System.out.println("Trip ends at "+list.getLast());
    }
    //Enhanced loop
    public static void printItinerary2(LinkedList<String> list){
        System.out.println("------------------------------------ Enhanced loop ----------------------------------- ");
        System.out.println("Trip starts at "+list.getFirst());
        String previousTown = list.getFirst();
        for(String town: list){
            System.out.println("-- > From "+previousTown+" to "+town);
            previousTown=town;
        }
        System.out.println("Trip ends at "+list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list){
        System.out.println("------------------------------------ using list Iterator ----------------------------------- ");
        System.out.println("Trip starts at "+list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
       while (iterator.hasNext()){
           var town = iterator.next();
            System.out.println("-- > From "+previousTown+" to "+town);
            previousTown=town;
        }
        System.out.println("Trip ends at "+list.getLast());
    }
    public static void testIterator(LinkedList<String> list){
        var iterator = list.iterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            if(iterator.next().equals("Sudan")){
                iterator.remove();
            }
        }
        System.out.println(list);

    }
    public static void testListIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            if(iterator.next().equals("Nairobi")){
                iterator.add("Tunis");
                iterator.add("Lagos");
//                iterator.remove();
            }
        }
        System.out.println("---------start using previous-------------");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("---------end using previous-------------");
        System.out.println(list);

        var iterator2 = list.listIterator(4);
        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());

    }
}
