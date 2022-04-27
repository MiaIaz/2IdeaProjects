package day43_Abstraction.employee;

public class Driver extends Employee{

    public Driver(String name, int age, int id, double salary, char gender) {
        super(name,"Driver", age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+getJobTitle()+" drives the cars from one place to another");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+getJobTitle()+" is sleeping only 6 hours");
    }
}
