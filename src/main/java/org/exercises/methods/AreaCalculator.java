package org.exercises.methods;

public class AreaCalculator {
    public static void main(String[] args) {
        double radius = 5.0;
        double width = 5.0;
        double height =4.0;
        System.out.println("Area of the Circle is "+area(radius));
        System.out.println("Area of the Rectangle is "+area(width,height));
    }
    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }
       return (Math.PI * radius * radius);
    }
    public static double area(double width,double height){
        if(width<0 || height<0){
            return -1.0;
        }
        return (width * height);
    }
}
