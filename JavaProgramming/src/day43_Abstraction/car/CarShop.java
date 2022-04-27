package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

       // Car car1 = new Car("Cydeo")==> we can not create object from a Abstract class, because Abstract class is not concrete

        Honda honda = new Honda("Accord","Black",2019,30000);
        Audi audi = new Audi("A7","Black",2021,56999);
        Tesla tesla = new Tesla("Model13", "Grey", 2020, 78000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("==============================================");

        honda.setColor("Yellow");
        audi.setColor("Purple");
        tesla.setColor("Black");

        honda.setPrice(36897);
        audi.setPrice(78062);
        tesla.setPrice(87962);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }
}
