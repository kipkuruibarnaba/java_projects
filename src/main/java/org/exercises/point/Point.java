package org.exercises.point;

public class Point {
    private int x;
    private int y;


   public double distance(){
//       d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//       Point 0,0
       return 2.1;
   }

   public double distance(int x,int y){
//       Math.sqrt
//       d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//       d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
//               =Math.sqrt(  )
      return 2;
   }
    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
