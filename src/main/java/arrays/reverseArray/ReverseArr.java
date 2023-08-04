package arrays.reverseArray;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);

    }
    private static void reverse(int[] arr){
        System.out.println("Array = "+ Arrays.toString(arr));
        int[] array = Arrays.copyOf(arr,arr.length);
        int maxLength = array.length-1;
        int halfLength = array.length/2;
        for (int i =0;i<halfLength;i++){
           int temp= arr[i];
           array[i] =array[maxLength-i];
            array[maxLength-i] = temp;
        }
        System.out.println("Reversed array "+ Arrays.toString(array));
    }
}
