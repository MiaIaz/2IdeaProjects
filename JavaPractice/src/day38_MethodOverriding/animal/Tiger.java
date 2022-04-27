package day38_MethodOverriding.animal;

public class Tiger extends Animal{
    public Tiger(String name, String breed, String color, String size, int age, char gender) {
        super(name, breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"eats deer");
    }
}
