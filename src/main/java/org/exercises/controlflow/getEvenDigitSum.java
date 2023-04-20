package org.exercises.controlflow;

public class getEvenDigitSum {
    public static void main(String[] args) {
        int number = 2002;
        System.out.println("The sum of even digits in the number "+number+" is "+sumDigits(number));
    }
    public static int sumDigits (int number){

        if (number <0) return -1;

        int sum = 0;
        int remainder = 0;
        while (number > 0){
            remainder = number % 10;
            sum += (remainder % 2 == 0) ? remainder:0;
            number /= 10;
        }
        return sum;
    }
}
