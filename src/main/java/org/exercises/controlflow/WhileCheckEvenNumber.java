package org.exercises.controlflow;

public class WhileCheckEvenNumber {
    public static void main(String[] args) {
        int number = 9;
        int count = 0;
//        System.out.println(8+" is "+(isEven(number)? "":"NOT ")+"even number");
        int start =5;
        while (start<=20){
            start++;
            if(!isEven(start)){
                continue;
            }
            System.out.println(start);
            count++;
            if(count >= 5){
                break;
            }
        }
    }
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
