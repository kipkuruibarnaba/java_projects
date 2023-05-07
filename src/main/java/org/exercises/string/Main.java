package org.exercises.string;

public class Main {
    public static void main(String[] args) {
     printSpring("Hello World");
        printSpring("");
        printSpring("\t  \n");
        String HelloWorld = "Hello World";
        System.out.printf("The index of l is %d %n", HelloWorld.indexOf('l'));
        System.out.printf("The index of World is %d %n", HelloWorld.indexOf("World"));

        System.out.printf("The index of l is %d %n", HelloWorld.indexOf("l"));
        System.out.printf("The index of l is %d %n", HelloWorld.lastIndexOf("l"));

        System.out.printf("The index of l is %d %n", HelloWorld.indexOf("l",3));
        System.out.printf("The index of l is %d %n", HelloWorld.lastIndexOf("l",8));

        String helloWorldToLower = HelloWorld.toLowerCase();
        if(helloWorldToLower.equals(HelloWorld)){
            System.out.println("Values match exactly");
        }
        if(helloWorldToLower.equalsIgnoreCase(HelloWorld)){
            System.out.println("Values match ignoring case");
        }

        if(HelloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if(HelloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(HelloWorld.contains("World")){
            System.out.println("String contains  World");
        }

        if(HelloWorld.contentEquals("Hello World")){
            System.out.println("Values match exactly");
        }
    }
    public static void printSpring(String string){
        int length = string.length();
        System.out.printf("The length of the string is %d %n", length);
           if(string.isEmpty()){
               System.out.println("String is empty");
               return;
           }
        if(string.isBlank()){
            System.out.println("String is blank");
//            return;
        }
        System.out.printf("The first character of the "+string+" is %c %n", string.charAt(0));
        System.out.printf("The last character of the "+string+" is %c %n", string.charAt(string.length()-1));
    }
}
