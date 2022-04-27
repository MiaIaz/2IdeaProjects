package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test1 started");

        try{
            System.out.println(9/0);

            System.out.println("Try Block");

        }catch(ArithmeticException e){

            System.out.println("Catch Block");

            System.out.println("Arithmetic Exceptions was occurred");
        }


        System.out.println("Test1 completed");


        System.out.println("=======================================");

        int[]numbers = {1,2,3,4,5,6};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try Block");

        }catch (RuntimeException e){

            System.out.println("Catch Block");

            System.out.println("Run time exception was occurred.");
        }


        System.out.println("Test2 Completed");

        System.out.println("==========================================");

        System.out.println("Test 3 started!");

        try {

            System.out.println("Cydeo".substring(2,0));

        }catch (RuntimeException e){

            e.printStackTrace();

        }

        System.out.println("Test 3 finished");

        System.out.println("=======================================");







    }
}
