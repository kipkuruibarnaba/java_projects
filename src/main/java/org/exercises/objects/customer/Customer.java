package org.exercises.objects.customer;

public class Customer {
    private String name;
    private String emailaddress;
    private double creditlimit;


    public Customer() {
        this("Barn","barnmutahi@gmail.com");
    }
    public Customer(String name, String emailaddress) {
        this(name,emailaddress,2000);
    }

    public Customer(String name, String emailaddress, double creditlimit) {
        this.name = name;
        this.emailaddress = emailaddress;
        this.creditlimit = creditlimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public double getCreditlimit() {
        return creditlimit;
    }
}
