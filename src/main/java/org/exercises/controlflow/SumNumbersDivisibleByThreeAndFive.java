package org.exercises.controlflow;

public class SumNumbersDivisibleByThreeAndFive {
    public static void main(String[] args) {
        int sum = 0;
        int count =0;
        for(int num =1; num < 1000 ;num++) {
            if((num > 0) && (num%3 == 0 )&& num%5==0){
                System.out.println(num+" is divisible by both three and five");
                sum= sum+num;
                count++;
                if(count ==5){
                    break;
                }
            }
        }

        System.out.println(sum+" is the sum of numbers divisible by both three and five that are between 1 and 50");

    }
}
