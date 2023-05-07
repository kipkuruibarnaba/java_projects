package org.exercises.worker;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthdate, String hireDate, double hourlyPayRate) {
        super(name, birthdate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
       return hourlyPayRate/40;
    }

    public double getDoublePay(){
        return collectPay() * 2;
    }
}
