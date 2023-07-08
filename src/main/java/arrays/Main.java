package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] myIntArray = new int[10];
        myIntArray[6] = 9;
        System.out.println(myIntArray[6]);
        System.out.println("-".repeat(30));

        double [] myDoubleArray = new double[10];
        myDoubleArray[5] = 2.5;
        System.out.println(myDoubleArray[5]);
        System.out.println("-".repeat(30));

        int[] newArray;
//        newArray = new int[]{10,9,8,7,6,5,4,3,2,1};
        newArray = new int[10];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = newArray.length - i;
        }

        for (int i =0; i<newArray.length; i++){
            System.out.print(newArray[i]+" ");
        }
        System.out.println("-".repeat(30));
        for (int element : newArray){
            System.out.println(element);
        }
        System.out.println("-".repeat(30));
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if(objectVariable instanceof int []){
            System.out.println("object variable is really an int array");
        }
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] =Arrays.toString(newArray);
        System.out.println(Arrays.toString(objectArray));



    }
}
