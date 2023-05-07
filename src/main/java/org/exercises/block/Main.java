package org.exercises.block;

public class Main {
    public static void main(String[] args) {
        String bulletList = "This is the bullet list : \n"+
                "\t\u2022 First point \n" +
                "\t\u2022 Second point \n" +
                "\t\t\u2022 Sub point " ;
        System.out.println(bulletList);

        String textBlock = """
                This is the text block list : 
                  \u2022 First point 
                       \u2022 Second point 
                            \u2022 Third point """ ;
        System.out.println(textBlock);

        int age = 28;
        System.out.printf("You age is %d%n" , age);

        int yearOfBirth = 2023-age;
        System.out.printf("Age %d, Birthyear %d%n" , age, yearOfBirth);

        System.out.printf("You age is %f%n" , (float)age);
        System.out.printf("You age is %.2f\n" , (float)age);

        for (int i = 1; i <= 10000; i *= 10){
            System.out.printf("You age is %6d %n" , i);
        }
      String formatted = String.format("Your age is %d%n" , age);
        System.out.printf(formatted);
    }
}
