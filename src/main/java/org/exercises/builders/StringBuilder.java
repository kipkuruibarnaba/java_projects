package org.exercises.builders;

public class StringBuilder {

    public static void main(String[] args) {
        String helloWorld= "Hello "+ "World";
//        StringBuilder helloWorldstringBuilder = new StringBuilder("Hello "+ "World");
        java.lang.StringBuilder stringBuilder= new java.lang.StringBuilder("Hello "+ "World");
        printInfo(helloWorld);
        printInfo(String.valueOf(stringBuilder));

        java.lang.StringBuilder emptystart= new java.lang.StringBuilder();
        emptystart.append("b".repeat(32));
        System.out.println(emptystart);
        System.out.println(emptystart.length());

        java.lang.StringBuilder emptystart32= new java.lang.StringBuilder(32);
        emptystart32.append("a".repeat(16));
        System.out.println(emptystart32);
        System.out.println(emptystart32.length());

        java.lang.StringBuilder builderPlus= new java.lang.StringBuilder("Hello "+ "World");
        builderPlus.append(" and Goodbye");
        System.out.println(builderPlus);
        builderPlus.deleteCharAt(16).insert(16, "g");
        System.out.println(builderPlus);
        builderPlus.replace(16,17,"G");
        System.out.println(builderPlus);
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
        System.out.println(builderPlus.length());
    }
    public static void printInfo(String string){
        System.out.println("String = "+string);
        System.out.println("Length = "+string.length());


    }

    public static void printInfo(StringBuilder builder){
        System.out.println("String Builder = "+builder);
        System.out.println("Length = "+ builder.toString().length());
    }
}
