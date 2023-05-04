package org.exercises.worker;

public class Worker {
    private String name;
    private String bithdate;
    protected String endDate;


    public Worker() {
    }
    public Worker(String name, String birthdate) {
        this.name = name;
        this.bithdate = birthdate;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(bithdate.substring(6));
        return (currentYear-birthYear);
    }
    public Double collectPay(){
      return 0.0;
    }

    public void terminate(String endDate){
        this.endDate=endDate;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", bithdate='" + bithdate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
