package day11;

import java.util.Scanner;

public class Practice2_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you first sentence");
        String firstSentence = input.nextLine();

        System.out.println("Enter you second sentence");
        String secondSentence = input.nextLine();

        System.out.println("firstSentence: " + firstSentence);
        System.out.println("secondSentence: " + secondSentence);
        input.close();
    }
}
