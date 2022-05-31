package day38_Inheritance.carTask;

public class BMW extends Car{


    public BMW(String model, String colour, double price, int year, int miles) {
        super("BMW", model, colour, price, year, miles);
    }

    public void racing(){
        System.out.println(brand+" "+model +" is racing");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic to jumo start "+ brand + " "+ model);
    }
}
