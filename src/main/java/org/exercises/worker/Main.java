package org.exercises.worker;

public class Main {
    public static void main(String[] args) {
      Employee tim = new Employee("Tim","01/01/1994","11/11/2017");
      System.out.println(tim);
      System.out.println("Age "+tim.getAge());
      System.out.println("Pay "+tim.collectPay());

      Employee john = new Employee("John","01/01/1997","05/06/2022");

        System.out.println(john);
        System.out.println("Age "+john.getAge());
        System.out.println("Pay "+john.collectPay());
    }
}
