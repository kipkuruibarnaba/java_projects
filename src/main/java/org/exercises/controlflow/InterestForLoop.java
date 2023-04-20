package org.exercises.controlflow;

public class InterestForLoop {
    public static void main(String[] args) {
        for (double rate = 7; rate<=10; rate+=0.25 ){
            double interestAmount = calculateInterestRate(100.0,rate);
            if(interestAmount>8.5){
                break;
            }
            System.out.println("100.0 "+rate+ " interest rate = "+interestAmount);
        }

    }
    public static double calculateInterestRate (double amount,double rate){
        return (amount*(rate/100));

    }
}
