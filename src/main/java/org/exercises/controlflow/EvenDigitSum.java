package org.exercises.controlflow;

    public class EvenDigitSum {
        public static void main(String[] args) {
            //Sum digits in a number
            int number = -22;
            System.out.println("The sum of even digits in the number "+number+" is "+sumDigits(number));
        }
        public static int sumDigits(int number){
            if(number < 0){
                return -1;
            }
            int sum = 0;
            int firstDigit =(number%10)%2 == 0? number%10:0;
            while (number > 9){
                number = number / 10;
         if(((number % 10)%2) == 0){
                sum += number % 10;
               System.out.println("Loop for Even "+((number % 10)));
                }
            }
            sum = sum += firstDigit;
            return sum;

        }
    }
