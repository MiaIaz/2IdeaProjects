package day43_Abstraction.employee;

public class Teacher extends Employee{

    public Teacher(String name, int age, int id, double salary, char gender) {
        super(name, "Teacher", age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+getJobTitle()+" is teaching new subject");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+getJobTitle()+" is sleeping 7 hours");
    }
}
