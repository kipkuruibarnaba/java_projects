package arrays.reverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int userInput =readInteger();
        int[] array =readElements(userInput);
        System.out.println("Original input array :"+Arrays.toString(array));
        reversedArray(array);
        System.out.println("Reversed array :"+ Arrays.toString(array));

        int[] reversedArr = reversedArrayCopy(array);
        System.out.println("Reversed array method 2:"+ Arrays.toString(reversedArr));
        int[] arrayTwo =Arrays.copyOf(array,array.length);
        Arrays.sort(arrayTwo);
        System.out.println("Sorted Array :"+Arrays.toString(arrayTwo));
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

    private static void reversedArray(int[] array){
        int maxLength = array.length-1;
        int halfLength = array.length/2;
        for (int i =0;i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxLength-i];
            array[maxLength-i] = temp;
            System.out.println("Reverse " +i + "----> "+Arrays.toString(array));
        }
    }
    private static int[] reversedArrayCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length-1;
        for(int el : array){
            reversedArray[maxIndex--] =el;
        }
        return reversedArray;

    }
}
