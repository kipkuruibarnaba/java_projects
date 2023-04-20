package org.exercises.methods;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(-1);
//        System.out.println("Hello world!");
    }

    public static void checkNumber(int num) {
//        String numbertype;
//        if(num>0){
//           numbertype = "positive";
//        } else if(num == 0){
//            numbertype = "zero";
//        } else{
//            numbertype = "negative";
//        }

//        System.out.println(numbertype);
        System.out.println((num>0)?"positive":(num<0)?"negative":"zero");
    }
}