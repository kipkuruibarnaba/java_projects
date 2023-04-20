package org.exercises.methods;

public class BarkingDog {
    public static void main(String[] args) {
      boolean barking = false;
      int hourOfDay =44;
       boolean results= shouldWakeUp(barking,hourOfDay);
        System.out.println("Results "+results);
    }
    public  static  boolean shouldWakeUp(boolean bark, int hr){
        boolean wakeup ;
        if(hr < 0 || hr >24) {
            wakeup = false;
        }else if(hr<8 && bark == true){
          wakeup = true;
        } else if(hr>22 && bark == true){
            wakeup = true;
        } else {
            wakeup = false;
        }

        return wakeup;

    }
}
