package org.exercises.controlflow;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        int number = 335;
        System.out.println(number+" The first and last digit is sum "+fistLastDigit(number));
    }
    public static  int fistLastDigit(int number){
        if(number<0){
            return -1;
        }
        int num=number;

        int lastDigit = num%10;

        while(num>9){
            num = num/10;
        }
        System.out.println(lastDigit+num);
        return lastDigit+num;

    }
}
