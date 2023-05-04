package org.exercises.scanner;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
     System.out.println();
    }
    public  static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int count = 0;
        while (scanner.hasNextInt()){
            try{
                sum += scanner.nextInt();
                System.out.println("Enter number ");
                count++;
                avg = sum/count;
                System.out.println("SUM = "+ Math.round(sum)+" AVG = "+ Math.round(avg));
            }catch (NumberFormatException e){
                System.out.println("SUM = 0 AVG = 0");
            }
        }

    }
}
