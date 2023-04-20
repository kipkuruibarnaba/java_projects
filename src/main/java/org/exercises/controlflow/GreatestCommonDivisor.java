package org.exercises.controlflow;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int first = 12;
        int last = 30;
        System.out.println(first+ "and "+last +" greatest common divisor is "+getGreatestCommonDivisor(first,last) );
    }
    public  static int getGreatestCommonDivisor(int first,int last){
        if(first <0 || last < 0){
            return -1;
        }
return 1;

    }
}
