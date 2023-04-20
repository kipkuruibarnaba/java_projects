package org.exercises.controlflow;

public class LastDigitChecker {
    public static void main(String[] args) {
        int num1 =9;
        int num2 =99;
        int num3 =999;
        System.out.println("Right most Last digits are equal "+hasSameLastDigit(num1,num2,num3));
    }
    public  static boolean hasSameLastDigit(int num1,int num2,int num3){
        if(num1 >9 && num1 <1000
                && num2 >9  &&  num2 <1000
                && num3 >9  &&  num3 <1000
        ) {
            int num1firstdigit= num1%10;
            int num2firstdigit= num2%10;
            int num3firstdigit= num3%10;
            if(num1firstdigit
                    == num2firstdigit
                    || num1firstdigit==num3firstdigit
                    || num2firstdigit==num1firstdigit
                    || num2firstdigit==num3firstdigit
                    || num3firstdigit==num1firstdigit
                    || num3firstdigit==num2firstdigit
            ){
                return true;
            }
        }
         return false;
    }
}
