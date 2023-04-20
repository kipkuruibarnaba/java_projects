package org.exercises.controlflow;

public class CheckWeek {
    public static void main(String[] args) {
        PrintDayOfWeek(0);
        PrintDayOfWeek(1);
        PrintDayOfWeek(2);
        PrintDayOfWeek(3);
        PrintDayOfWeek(4);
        PrintDayOfWeek(5);
        PrintDayOfWeek(6);
        PrintDayOfWeek(7);

        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }
    public  static void PrintDayOfWeek(int day){
   String dayoftheweek = switch (day){
//       case 0 -> {yield "Sunday";}
       case 0 -> "Sunday";
       case 1 -> "Monday";
       case 2 -> "Tuesday";
       case 3 -> "Wednesday";
       case 4 -> "Thursday";
       case 5 -> "Friday";
       case 6 -> "Saturday";
       default -> "Invalid Day";
   };
        System.out.println(day+" stands for "+dayoftheweek);
    }

    public static void printWeekDay(int day){
        String dayoftheweek ="Invalid Day";
        if(day == 0){
            dayoftheweek = "Sunday";
        }else if(day == 1){
            dayoftheweek = "Monday";
        }
        else if(day == 2){
            dayoftheweek = "Tuesday";
        }
        else if(day == 3){
            dayoftheweek = "Wednesday";
        }
        else if(day == 4){
            dayoftheweek = "Thursday";
        }
        else if(day == 5){
            dayoftheweek = "Friday";
        }
        else if(day == 6){
            dayoftheweek = "Saturday";
        }
            System.out.println(day+" stands for "+dayoftheweek);

    }
}
