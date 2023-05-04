package org.exercises.pojo;

public class Main {
    public static void main(String[] args) {
        for (int i =1 ; i<= 5 ; i++){
            Student student = new Student(
                    "STD00"+1,
                    switch (i){
                        case 1 -> "Mary";
                        case 2 -> "Ben";
                        case 3 -> "Kenn";
                        case 4 -> "Willy";
                        case 5 -> "Kelly";
                        default -> "Anonymus";
                    },
                    "1994",
                    "Java Master Class"
            );
                    System.out.println(student);
        }

        Student pojoStudent = new Student(
                "STD00"+1,
                   "Kenn",
                "1994",
                "Java Master Class"
        );
        LPAStudent recStudent = new LPAStudent(
                "STD0034",
                "Bill",
                "1997",
                "ReactJS Master Class"
        );
        System.out.println("pojo  pojo");
        System.out.println(pojoStudent);
        System.out.println("rec  rec");
        System.out.println(recStudent);
        System.out.println(recStudent.name() +" is taking "+recStudent.classList());
        System.out.println(pojoStudent.getName() +" is taking "+pojoStudent.getClassList());
    }
}
