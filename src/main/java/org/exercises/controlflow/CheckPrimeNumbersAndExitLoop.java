package org.exercises.controlflow;

public class CheckPrimeNumbersAndExitLoop {
    public static void main(String[] args) {
        int num = 50;
        int count =0;
        for(int i = 10;i<=num; i++){
            if(isPrime(i)){
                System.out.println("number "+i+" is a prime numbers");
                count++;
                if(count==3){
                    System.out.println("Found 3 exiting for loop");
                    break;
                }
            }
        }
        System.out.println("There are "+count+" prime numbers between 10 and 50");

    }

    public  static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return wholeNumber==2;
        }
        for(int divisor=2; divisor< wholeNumber;divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;
    }
}

