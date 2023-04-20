package org.exercises.controlflow;

public class SharedDigit {
    public static void main(String[] args) {
        int x= 42;
        int y = 23;
      System.out.println(hasSharedDigit(x,y));
    }
    public static boolean hasSharedDigit(int x,int y){
        if((x < 10) || (x >99) || (y < 10) || (y >99)) {
          return false;
        }
        int x_firstdigit= x%10;
        int x_lastdigit= x/10;
        int y_firstdigit= y%10;
        int y_lastdigit= y/10;

         if(x_firstdigit==y_firstdigit || x_firstdigit==y_lastdigit || x_lastdigit==y_firstdigit||x_lastdigit==y_lastdigit){
             return true;
         }
        return false;
    }
}
