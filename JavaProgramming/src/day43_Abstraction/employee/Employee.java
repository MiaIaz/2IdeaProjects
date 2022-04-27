package day43_Abstraction.employee;

public abstract class Employee {

    private final String name, jobTitle;
    private final int age, id;
    private double salary;
    private final char gender;

    public Employee(String name, String jobTitle, int age, int id, double salary, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public abstract void work();

    public abstract void sleep();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
