package org.exercises.controlflow;

public class PalindromeChallenge {
    public static void main(String[] args) {
        int number =123;
        System.out.println(number +" is"+(isPalindrome(number)?"": " NOT")+" Palindrome");
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit =0;
        int num = number;
        while (num != 0) {
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        if (reverse == number) {
            return true;
        } else
            return false;
    }
}
