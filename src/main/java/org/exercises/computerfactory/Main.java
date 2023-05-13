package org.exercises.computerfactory;

public class Main {
    public static void main(String[] args) {
     Computercase thecase = new Computercase("2208","Dell","240");
     Monitor themonitor = new Monitor("27inch Beast","Acer",27,"2540*1440");
     Motherboard themotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");
     PersonalComputer thepc = new PersonalComputer("2208","Dell",thecase,themonitor,themotherboard);

//     thepc.getMonitor().drawPixel(10,10,"red");
//     thepc.getMotherboard().loadProgram("Window 10 OS");
//     thepc.getComputercase().pressPowerButton();

        thepc.powerUp();
    }
}
