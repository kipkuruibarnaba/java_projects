package org.exercises.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge",400);
       doAnimalStaff(animal,"slow");
       Dog dog = new Dog();
       doAnimalStaff(dog,"fast");
        Dog yorkie = new Dog("yokie",15);
        doAnimalStaff(yorkie,"fast");
        Dog retriever = new Dog("Larador retriever",65,"Floopy","Swimmer");
        doAnimalStaff(retriever,"slow");
        Dog wolf = new Dog("wolf",15);
        doAnimalStaff(wolf,"slow");

        Fish goldy = new Fish("goldfish",0.25,2,3);
        doAnimalStaff(goldy,"fast");
    }
    public static void doAnimalStaff(Animal animal, String speed){
      animal.makeNoise();
      animal.move(speed);
      System.out.println(animal);
      System.out.println("----------------");
    }
}
