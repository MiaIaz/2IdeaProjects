package day43_Abstraction.employee;

public class Developer extends Employee{

    public Developer(String name, int age, int id, double salary, char gender) {
        super(name,"Developer", age, id, salary, gender);
    }

    @Override
    public void work() {
        System.out.println(getName()+getJobTitle()+" is working on the codes");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+getJobTitle()+" is sleeping only 5 hours");
    }
}
