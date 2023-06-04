package org.exercises.encaptulations.Encapsulationprinter;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel>100 && tonerLevel<0 ?-1:tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount ){
        int total = tonerAmount+tonerLevel;
        if(total > 100 || total <0){
            return  -1;
        }
        tonerLevel+=tonerAmount;
        return tonerAmount;
    }
    public int printPages(int pages ){
        int jopPages = (duplex)?(pages/2)+(pages%2):pages;
        pagesPrinted+=jopPages;
        return jopPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
