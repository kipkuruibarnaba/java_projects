package org.exercises.worker;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo =1;

    public Employee(String name, String birthdate, String hireDate) {
        super(name, birthdate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
