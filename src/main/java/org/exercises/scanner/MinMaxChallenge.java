package org.exercises.scanner;

import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopcount = 1;
        double min = 0;
        double max = 0;
        double sum = 0;
        boolean dataType = true;
        while (dataType){
            System.out.println("Enter a number, or any character to exit:");
            String nextnumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextnumber);
                if(loopcount == 0 || number < min){
                    min = number;
                }
                if(loopcount == 0 || number > max){
                    max = number;
                }
                loopcount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        if(loopcount > 0 ){
            System.out.println("min "+ min +" max "+ max);
        } else {
            System.out.println("No Valid data");
        }
    }
}


