package org.exercises.objects.customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim","tim@gmail.com", 45000);
        System.out.println(customer.getName());
        System.out.println(customer.getEmailaddress());
        System.out.println(customer.getCreditlimit());
        System.out.println("Second Customer ==================");
        Customer sec = new Customer();
        System.out.println(sec.getName());
        System.out.println(sec.getEmailaddress());
        System.out.println(sec.getCreditlimit());

        System.out.println("Third Customer ==================");
        Customer thirdcus = new Customer("Joe","joe@gmail.com");
        System.out.println(thirdcus.getName());
        System.out.println(thirdcus.getEmailaddress());
        System.out.println(thirdcus.getCreditlimit());
    }
}
