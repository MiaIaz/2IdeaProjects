package day43_Abstraction.employee;

public class EmployeeWorkers {

    public static void main(String[] args) {

        Tester tester = new Tester("Mia",33,453,45000,'F');
        Developer developer = new Developer("Cristian",33,342,56000,'M');
        Teacher teacher = new Teacher("Natalia",34,543,67546,'F');
        Driver driver = new Driver("Martin",43,4525,89777,'M');

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        System.out.println("=======================================================================");




    }
}
