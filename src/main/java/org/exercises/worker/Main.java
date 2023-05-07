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

        SalariedEmployee ken = new SalariedEmployee("Ken","01/01/1997","05/06/2022",35000);

        System.out.println(ken);
        System.out.println("Age "+ken.getAge());
        System.out.println("ken Pay check = $"+ken.collectPay());

        ken.retire();
        System.out.println("ken pension check = $"+ken.collectPay());

      HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970","05/06/2021",35000);

      System.out.println(mary);
      System.out.println("Mary "+ken.getAge());
      System.out.println("Mary Pay check = $"+mary.collectPay());

      ken.retire();
      System.out.println("Mary Doube Pay check = $"+mary.getDoublePay());
    }
}
