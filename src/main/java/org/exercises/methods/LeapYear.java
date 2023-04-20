package org.exercises.methods;

public class LeapYear {
    public static void main(String[] args) {
      int year = 1600;
       boolean result= isLeapYear(year);
       System.out.println("Results "+result);
    }
    public static boolean  isLeapYear(int year){
      boolean leapyear = false;
      if(year >= 1 && year <9999){
          if(year % 4 == 0 && year % 100 != 0){
              leapyear = true;
          }else if(year % 100 == 0 && year % 400 == 0){
              leapyear = true;
          }else{
              leapyear = false;
          }
      }
      return  leapyear;
    }
}
