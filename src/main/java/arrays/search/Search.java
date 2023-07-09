package arrays.search;

import java.util.Arrays;
import java.util.Random;

public class Search {
    public static void main(String[] args) {
        String [] sArray = {"Able","Jane","Mark","Ben","Kenn","Ruth"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"Ken") >= 0){
            System.out.println("Found Ken in the list");
        }

        int[] s1 = {4,7,8,9,3,2,5};
        int[] s2 = {4,7,8,9,3,2,5};
        if(Arrays.equals(s1,s2)){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are not equal");
        }

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArr = sortArrayDescending(new int[] {7, 30, 35,40,52});
        System.out.println(Arrays.toString(sortedArr));

    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];
      for (int i =0;i<len;i++){
          randomArray[i] = random.nextInt(1000);
      }
      return  randomArray;
    }

   private static int[] sortArrayDescending(int[] array){
       System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i =0; i <sortedArray.length-1;i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("----------> "+Arrays.toString(sortedArray));
                }
            }
            System.out.println("---> "+Arrays.toString(sortedArray));
        }
        return  sortedArray;
   }
}
