package org.exercises.methods;

public class PlayingCat {
    public static void main(String[] args) {
        boolean summer = false;
        int temperature  = 35;
        System.out.println(isCatPlaying(summer,temperature));
    }
    public  static boolean isCatPlaying(boolean summer,int temperature){
        if(temperature >=25 && temperature <=45 && summer){
            return true;
        } else if(temperature >=25 && temperature <=35){
            return true;
        }
        return false;
    }
}
