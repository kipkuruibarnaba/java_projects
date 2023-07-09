package arrays.minimumelementchallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
       int userInput =readInteger();
       int[] array =readElements(userInput);
       Arrays.sort(array);
        System.out.println("Array :"+Arrays.toString(array));
        int minInt =findMin(array);
        System.out.println("Min Int :"+minInt);
    }
    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String input = scanner.nextLine();
        int enteredNum= Integer.parseInt(input);
        return  enteredNum;
    }
    private static int[] readElements(int number){

        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[number];
        System.out.println("Enter " + number + " integers:");
        for(int i=0; i<number; i++){
            myArray[i] = sc.nextInt();
        }
        sc.close();
        return myArray;
    }

    private static int findMin(int[] array){
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
//                    System.out.println("------------------> "+Arrays.toString(newsortedArray));
                }
            }
//            System.out.println("-------> "+Arrays.toString(newsortedArray));
        }
        return newsortedArray[newsortedArray.length-1];
    }
}
