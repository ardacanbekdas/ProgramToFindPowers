package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class ProgramToFindPowers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        System.out.print("Powers of 4: ");

        for (int i = 1; i <= number; i *= 4) {
            System.out.print(i +", ");
        }

        System.out.println();
        System.out.print("Powers of 5: ");


        for (int i = 1; i <= number; i *= 5) {
            System.out.print(i + ", ");
        }

    }
}

//Java program that prints powers of 4 and 5 up to the entered number using loops.