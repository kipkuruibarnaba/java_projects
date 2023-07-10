package arrays.minimumelementchallenge;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinimunElementChallenge {
    public static void main(String[] args) {
//        int inputNumbers = readIntegers();
//        System.out.println(inputNumbers);
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));
        int[] reversedArr = reversedArrayCopy(returnedArray);
        System.out.println("Reversed array :"+ Arrays.toString(reversedArr));
        int returnedMin  = findMin(returnedArray);
        System.out.println("Returned Min :" +returnedMin);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        System.out.println("Entered list of integers, : "+Arrays.toString(splits));
        int[] values = new int[splits.length];
        for (int i =0;i< splits.length;i++){
          values[i] =Integer.parseInt(splits[i].trim());
        }
        return  values;
    }
    private static int findMin(int[] array){
      int min =Integer.MAX_VALUE;
      for(int el:array){
          if(el<min){
              min=el;
          }
      }
      return min;
    }

//    private static void reversedArray(int[] array){
//        int maxLength = array.length-1;
//        int halfLength = array.length/2;
//        for (int i =0;i<halfLength;i++){
//            int temp = array[i];
//            array[i] = array[maxLength-i];
//            array[maxLength-i] = temp;
//            System.out.println("Reverse " +i + "----> "+Arrays.toString(array));
//        }
//    }
    private static int[] reversedArrayCopy(int[] array){
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length-1;
        for(int el : array){
            reversedArray[maxIndex--] =el;
        }
        return reversedArray;

    }
}
