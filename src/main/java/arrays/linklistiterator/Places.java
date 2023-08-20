package arrays.linklistiterator;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name,int distance){
    @Override
    public String toString() {
        return String.format("%s(%d)",name,distance);
    }
}
public class Places {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
        Place kenya = new Place("Nairobi",350);
//        Place uganda = new Place("Nairobi",3425);
         addPlaces(placesToVisit,kenya);
         addPlaces(placesToVisit,new Place("nairobi",350));
        addPlaces(placesToVisit,new Place("Nakuru",150));
        addPlaces(placesToVisit,new Place("Naivasha",290));
        addPlaces(placesToVisit,new Place("Kericho",170));
        addPlaces(placesToVisit,new Place("Eldoret",345));
        addPlaces(placesToVisit,new Place("Mombasa",500));
        placesToVisit.addFirst(new Place("Olenguruone",0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner =new Scanner(System.in);
        boolean quitloop = false;
        boolean forward = true;
        while (!quitloop){
            if(!iterator.hasPrevious()){
                System.out.println("Originating :"+iterator.next());
                forward=true;
            }
            if(!iterator.hasNext()){
                System.out.println("Final :"+iterator.previous());
                forward=false;
            }
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);
            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if(!forward){ //reversing direction
                        forward=true;
                        if(iterator.hasNext()){
                            iterator.next();//Adjust the position forward
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User wants to go backward");
                    if(forward){ //reversing direction
                        forward=false;
                        if(iterator.hasPrevious()){
                            iterator.previous();//Adjust the position backwards
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    printmenu();
                    break;
                default:
                    quitloop=true;
                    break;
            }
        }
    }
    private static void addPlaces(LinkedList<Place> list , Place place){
        if(list.contains(place)){
            System.out.println("Not added to the list, Found duplicate "+place);
            return;
        }
        for (Place p: list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Not added to the list, Found duplicate "+place);
                return;
            }
        }
        int matchedIndex=0;
        for(var listPlace:list){
            if(place.distance()< listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
         list.add(place);

    }
    public static void printmenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
