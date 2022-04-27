package day38_MethodOverriding.animal;

public class Dog extends Animal {
    public Dog(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "eats dog food");
    }
}
