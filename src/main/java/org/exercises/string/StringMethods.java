package org.exercises.string;

public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "04/07/1992";
        int startingIndex = birthDate.indexOf("1992");
        System.out.println("Starting index = "+ startingIndex);
        System.out.println("Birth year = "+ birthDate.substring(startingIndex));
        System.out.println("Month = "+ birthDate.substring(3,5));
        String newDate = String.join("/","04","07","1992");
        System.out.println("new date = "+newDate);
        newDate = "14";
        newDate = newDate.concat("/");
        newDate = newDate.concat("05");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1994");
        System.out.println("new date = "+newDate);

        System.out.println("new date = "+newDate.replace("/","-"));
        System.out.println("new date = "+newDate.replace("4","5"));
        System.out.println("new date = "+newDate.replaceFirst("/","-"));
        System.out.println("new date = "+newDate.replaceAll("/","---"));
        System.out.println("ABC\n".repeat(3));
        System.out.println("--\n".repeat(3));
        System.out.println("--=".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("--=".repeat(20));

        System.out.println("  ABC\n".repeat(3).indent(-2));
        System.out.println("--=".repeat(20));
    }
}
