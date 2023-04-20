package org.exercises.controlflow;

public class CheckIfOdd {
    public static void main(String[] args) {
        int number =10;
        int start = 13;
        int end = 13;
        System.out.println(number + " is"+(isOdd(number)? "": " NOT")+" odd number");
        int totalsum = sumOdd(start,end);
        System.out.println("Sum = "+totalsum);
    }

    public static int sumOdd(int start, int end){
        if(end>0 && start>0 && end>=start){
            int sum =0;
            System.out.println("==== Odd numbers between "+start+" and "+end+" ====\n");
            for(int i =start;i<= end; i++){
                if(isOdd(i)){
                    System.out.println("Odd number "+i);
                    sum= sum+i;
                }
            }
            return sum;
        }
        return -1;
    }
    public  static boolean isOdd(int num){
        if(num > 0){
            if(num % 2 ==0){
                return  false;
            }else {
                return true;
            }
        }
        return false;
    }
}
