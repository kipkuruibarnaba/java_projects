package org.exercises.methods;

public class SecondsMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }
    public static String getDurationString(int sec){
        int minutes =sec/60;
        int seconds =sec%60;

     if(sec>=0){
        return getDurationString(minutes,seconds);
     }
     return "Invalid Entered Seconds Value";
    }
    public static String getDurationString(int min,int sec){
        if(sec>=0 && sec<=59 && min>=0){
            int hours =min/60;
            int minutes= min%60;
            return (hours+"h "+minutes+"m "+sec+"s ");
        }
        return "Invalid Minutes and Seconds Value";
    }
}
