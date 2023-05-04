package org.exercises.object;

public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max", 17);
        System.out.println(max);
        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 12,"Carol");
         System.out.println(jimmy);
    }
}
    class Student {
        private String name;
        private int age;

         Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
             return name +"   is "+ age;
//            return "Student{" +
//                    "name='" + name + '\'' +
//                    ", age=" + age +
//                    '}';
        }
    }

    class PrimarySchoolStudent extends Student {
        private String parentname;
        PrimarySchoolStudent(String name, int age, String parentname) {
            super(name, age);
            this.parentname = parentname;
        }

        @Override
        public String toString() {
            return parentname + "'s kid " + super.toString();
        }
    }



