package org.exercises.methods;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
     long minutes =-561600;
     printYearsAndDays(minutes);
    }
    public  static void printYearsAndDays(long minutes){
     if(minutes>0){
         long hours = minutes/60;
         long days = hours/24;
         long years = days/365;
         long remainingdays = days%365;
         System.out.println(minutes+" min = "+years+" y and "+remainingdays+" d");
     } else {
         System.out.println("Invalid Value");
     }
    }
}
