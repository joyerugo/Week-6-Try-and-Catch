package org.example;

import java.util.Scanner;

public class TryExample {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please enter a number between 0 - 9 :");

                String input = scan.nextLine();


                try {
                    // Parse the input to an integer
                    int myNum = Integer.parseInt(input);

                    // Check if the number is between 0 and 9
                    if (myNum >= 0 && myNum <= 9) {
                        System.out.println("You entered " + myNum);
                        break;
                    } else {
                        System.out.println("Not a valid number. Please enter a number between 0 and 9.");
                    }

                } catch (NumberFormatException nfe) {
                    System.out.println("Not a valid number, try again!");
                }
            }
        }
    }
}