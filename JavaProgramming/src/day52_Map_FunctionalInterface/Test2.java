package day52_Map_FunctionalInterface;

public class Test2 {

    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach = (str) -> {
            for (String each : str.split("")) {
                System.out.println(each);
            }
        };
        printEach.test("Wooden Spoon");

        System.out.println("=====================================================================");


        MySecondFunctionalInterface<Integer> cube = (n) -> {
            System.out.println(n*n*n);
        };
        cube.test(5);


    }
}
