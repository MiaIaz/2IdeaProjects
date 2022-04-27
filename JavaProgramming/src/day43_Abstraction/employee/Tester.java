package day43_Abstraction.employee;

public class Tester extends Employee{

    public Tester(String name, int age, int id, double salary, char gender) {
        super(name, "Tester", age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+getJobTitle()+" is working on tickets");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+getJobTitle()+" is sleeping only 6 hours");
    }
}
