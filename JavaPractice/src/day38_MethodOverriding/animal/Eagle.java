package day38_MethodOverriding.animal;

public class Eagle  extends Animal{
    public Eagle(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"eats snake");
    }
}
