package org.exercises.controlflow;

public class DigitsSumChallenge {
    public static void main(String[] args) {
        //Sum digits in a number
        int number = 1234;
        System.out.println("The sum of digits in the number "+number+" is "+sumDigits(number));
        System.out.println("The sum of digits in the number "+number+" is "+sumDigits(-12));
    }
    public static int sumDigits(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
            while (number > 9){

                //Extracting right most digit
                sum += (number % 10);

                //Truncating right most digits
                number = number / 10;
                System.out.println("Loop "+(number));
            }
            sum += number;
            return sum;

    }
}
