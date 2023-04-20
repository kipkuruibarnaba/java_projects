package org.exercises.controlflow;

public class SumDigits {
    public static void main(String[] args) {
        int num = 132;
        int results = sum(num);
        System.out.println(results);
    }
    public static int sum(int num){
        int count =0;
        for (; num != 0; num /= 10, ++count) {
            return count;
        }
        return -1;
    }
}
