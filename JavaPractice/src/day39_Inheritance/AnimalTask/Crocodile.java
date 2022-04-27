package day39_Inheritance.AnimalTask;

public class Crocodile extends WildAnimal{

    public Crocodile(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }


    @Override
    public void hunt() {
        System.out.println("Crocodile "+getName()+" hunts reptiles");
    }


}
