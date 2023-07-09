package arrays.sortArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int number =5;
        int[] passedArray = getIntegers(number);
        System.out.println(Arrays.toString(passedArray));
        int[] newpassedArray= sortIntegers(passedArray);
//        Arrays.sort(newpassedArray);
        System.out.println(Arrays.toString(newpassedArray));
        printArray(passedArray);
    }
    public static void printArray(int[] myArray){

        for(int i=0; i< myArray.length; i++){
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
    }
    public static int[] getIntegers(int number){

        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[number];
        System.out.println("Enter " + number + " integers:");
        for(int i=0; i<number; i++){
            myArray[i] = sc.nextInt();
        }
        sc.close();
        return myArray;
    }
    public static int[] sortIntegers(int[] array){
        int[] newsortedArray = Arrays.copyOf(array,array.length);
        int temp;
        boolean flag = true;
        while (flag){
            flag=false;
            for (int i =0;i < newsortedArray.length-1; i++){
                if(newsortedArray[i] <newsortedArray[i+1]) {
                    temp = newsortedArray[i];
                    newsortedArray[i] = newsortedArray[i+1];
                    newsortedArray[i+1] =temp;
                    flag=true;
                    System.out.println("------------------> "+Arrays.toString(newsortedArray));
                }
            }
            System.out.println("-------> "+Arrays.toString(newsortedArray));
        }
        return newsortedArray;
    }
}
