package day22_Arrays_MultiDimensinal;

import java.util.Arrays;

public class TwoArray_ReturnArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7,8};
        int[] arr3 = {9,10,11,12,13,14};

        int[][] arr2D = new int[3][];
        arr2D[0] = arr1;
        arr2D[1] = arr2;
        arr2D[2] = arr3;

        int[][] result= new int [arr2D.length][];

        for (int i = 0; i < arr2D.length; i++) {
            int[] temp = new int[arr2D[i].length];
            for (int j = 0; j < arr2D[i].length; j++) {
                temp[(temp.length-1)-j ]= arr2D[i][j];
            }
            result[(arr2D.length - 1) - i] = temp;
        }

        System.out.println(Arrays.deepToString(result));


    }
}
/*
1. Write a program that can reverse a two-dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};

 */