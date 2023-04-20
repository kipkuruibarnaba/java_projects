package org.exercises.methods;

public class SpeedConverter {
    public static void main(String[] args) {
      double kilometersPerHour = 10.25;
     long result= toMilesPerHour(kilometersPerHour);
      System.out.println(result);
        printConversion(kilometersPerHour);
    }

    public  static void printConversion(double kilometersPerHour){
        if(kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }

    public  static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        long rounded = Math.round(kilometersPerHour/1.609);
        return (Math.round(rounded));
    }
}
