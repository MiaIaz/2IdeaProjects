package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B';

        ........

         */

        /*
        for(char i = 0, j = 'A'; i < letters.length; i++, j++){
            letters[i]=j;
        }

         */

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters) ); //[A~Z]


        System.out.println("--------------");

        char[]letters2 = new char[26]; //[Z~A]

        char ch2 = 'Z';
        for (int i = 0; i < letters2.length ; i++, ch--){
            letters2[i] = ch;
        }
        System.out.println( Arrays.toString(letters2) );

    }
}
