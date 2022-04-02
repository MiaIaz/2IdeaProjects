package day25;

public class ReverseArray {
    
    public static int[] reverseArray(int[] array){
        int[]result = new int[array.length];
        int j =0;
        for (int i = array.length-1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }
    public static double[] reverseArray(double[] array){
        double[]result = new double[array.length];
        int j =0;
        for (int i = array.length-1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }
    public static char[] reverseArray(char[] array){
        char[]result = new char[array.length];
        int j =0;
        for (int i = array.length-1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }
    public static String[] reverseArray(String[] array){
        String[]result = new String[array.length];
        int j =0;
        for (int i = array.length-1; i >= 0; i--) {
            result[j++] = array[i];
        }
        return result;
    }
}
/*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */