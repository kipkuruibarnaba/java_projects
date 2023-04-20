package org.exercises.controlflow;

public class CountPrimeNumbersAndBreakLoop {
    public static void main(String[] args) {
        //Count prime numbers between 10 and 50
        int count =0;
        for (int num = 10; num < 50; num++ ){
            if(ifPrime(num)){
                System.out.println(num+" is a prime number");
                count++;
                if(count==3){
                    break;
                }
            }
        }
        System.out.println("There are "+count+" prime numbers between 10 and 50");
    }

    public static boolean ifPrime(int wholenumber){
        if(wholenumber<=2){
            return wholenumber==2;
        }
        for(int divisor = 2; divisor < wholenumber; divisor++){
            if(wholenumber % divisor==0){
                return false;
            }
        }
        return  true;
    }
}
