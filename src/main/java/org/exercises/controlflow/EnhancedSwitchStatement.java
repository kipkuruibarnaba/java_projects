package org.exercises.controlflow;

public class EnhancedSwitchStatement {
    public static void main(String[] args) {
        char charValue = 'X';
        switch (charValue) {
            case 'A' -> System.out.println("A is able");
            case 'B' -> System.out.println("B is barker");
            case 'C' -> System.out.println("C is charlie");
            case 'D' -> System.out.println("D is dog");
            case 'E' -> System.out.println("E is easy");
            default -> System.out.println("Letter " + charValue + " was not found in the switch");
        }
    }
}
