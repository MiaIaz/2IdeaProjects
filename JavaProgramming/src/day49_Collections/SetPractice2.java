package day49_Collections;

import java.util.*;

public class SetPractice2 {

    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon","Wooden Spoon","Wooden Spoon", "Milk", "Eggs", "Coke", "Paper Towels"};
/*
        Set<String> set1 = new HashSet<>(Arrays.asList(arr));
        arr = set1.toArray(new String[0]);

        System.out.println("set1 = " + set1);

        System.out.println(Arrays.toString(arr));

 */


        arr = new LinkedHashSet<>(Arrays.asList(arr) ).toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println("=====================================");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 600, 10, 10, 20, 30, 40, 30, 10, 10));

        list = new ArrayList<>(new LinkedHashSet<>(list) );

        System.out.println(list);

        System.out.println("======================================");

        String[] array = {"A", "A", "B", "C"};

        Set<String> s = new LinkedHashSet<>();
        s.addAll(Arrays.asList(array));
        s.addAll(Arrays.asList("E", "F", "G") );

        /*
        Given:

         integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10}

         return the fifth element after removing the duplicates
                     Do not change the order of the elements
         */

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>( Arrays.asList(nums) ).toArray(new Integer[0] );
        System.out.println(Arrays.toString(nums));




        System.out.println("=======================================");

        String str = "eeeeeaaaabbbbccccdddeeeee";

        String result = ""; //a4b4c4d3e5

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            result += each + Collections.frequency(Arrays.asList(str.split("")), each);
        }

        System.out.println(result);

        System.out.println("============================================");

        Set<String> names = new LinkedHashSet<>();

        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "Breanna", "Shay", "Ahmet"));

        System.out.println(names.toArray(new String[0]) [2] );

        System.out.println( new ArrayList<>(names).get(0) );

        for( String each : names ){
            System.out.println(each);
        }




    }
}
