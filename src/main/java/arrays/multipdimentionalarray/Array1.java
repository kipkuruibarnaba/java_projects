package arrays.multipdimentionalarray;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[][] array1=new int[4][4];
        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);
        for (int[] arr : array1){
//            System.out.println(arr);
            System.out.println(Arrays.toString(arr));
        }
        for (int i =0; i<array1.length;i++){
            var innerArray = array1[i];
            for (int j=0;j<innerArray.length;j++)
            {
                array1[i][j] = (i*10)+(j+1);
//                System.out.println(array1[i][j] +" ");
            }
        }

//        for (var outer : array1){
//            for (var element : outer){
//                System.out.print(element+ " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.deepToString(array1));
        array1[2] =new int[]{10,20,30};
        System.out.println(Arrays.deepToString(array1));
        Object[] newObj = new Object[3];
        System.out.println(Arrays.deepToString(newObj));
         newObj[1] = new String[]{"a","b","c"};
        newObj[0] = new int[]{4,7,3};
        System.out.println(Arrays.deepToString(newObj));
        newObj[1] = new String[][]{
                {"2", "4"},
                {"10", "13","9"},
                {"15", "32","21"},
        };
        System.out.println(Arrays.deepToString(newObj));
        newObj[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(newObj));
        for (Object ele : newObj){
            System.out.println("Element type = "+ele.getClass().getSimpleName());
            System.out.println("Element to String = "+ele);
            System.out.println(Arrays.deepToString((Object[]) newObj));
        }
    }
}
