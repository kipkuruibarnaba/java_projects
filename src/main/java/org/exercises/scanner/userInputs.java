package org.exercises.scanner;

import java.util.Scanner;

public class userInputs {
    public static void main(String[] args) {
//        getInputFromConsole(1992);
       System.out.println( getInputFromScanner(2022));

    }
    public static  String getInputFromConsole(int currentyear){
        String name = System.console().readLine("Hi, Whats your name ?");
        System.out.println("Hi "+name+", thanks for taking the course");
        String dateofbirth = System.console().readLine("What year were you born ?");
        int age = currentyear - Integer.parseInt(dateofbirth);
        return "So you are "+age+" years old";
    }
    public static  String getInputFromScanner(int currentyear){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Whats your name ?");
        String name = scanner.nextLine();
        System.out.println("Hi "+name+", thanks for taking the course");
        System.out.println("What year were you born ?");
        boolean validDob = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth > " +(currentyear-125)+ " and <= "+(currentyear));
            try{
                age = checkdob(currentyear, scanner.nextLine());
                validDob = age < 0 ? false: true;
            }catch (NumberFormatException badUserData){
                System.out.println(badUserData+" Characters not allowed !!! Try again");
            }
        } while (!validDob);
        return "So you are "+age+" years old";
    }

    public static int checkdob(int currentyear, String dateofbirth){
       int minimumyear = currentyear - 125;
       int dob = Integer.parseInt(dateofbirth);
       if(dob > currentyear || dob < minimumyear){
           return -1;
       }
       return (currentyear-dob);
    }
}
