package org.exercises.encaptulations.printer;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonnerLevel, boolean duplex) {
        this.tonerLevel = tonnerLevel <= 100 && tonnerLevel>= 0? tonnerLevel: -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount>0 && tonerAmount<=100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }
    public int printPages(int pages){
        int jopPages = (duplex)?(pages/2)+(pages%2):pages;
        pagesPrinted+=jopPages;
        return jopPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
