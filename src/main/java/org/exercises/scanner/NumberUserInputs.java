
package org.exercises.scanner;

        import java.util.Scanner;

public class NumberUserInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
//        int sum = 0;
        while (counter <=5){
            System.out.println("Enter number #"+counter+":");
            String nextnumber = scanner.nextLine();
            try{
                double number = Double.parseDouble(nextnumber);
                counter++;
                sum+=number;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid number");
            }
            System.out.println("The sum of the 5 numbers is = "+sum);
        }
    }
}

