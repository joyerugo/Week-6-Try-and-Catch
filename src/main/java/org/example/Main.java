package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class main {
    public static void main(String[] args) {

        System.out.println("Please enter a number between 0 - 9:");
        Scanner myscan = new Scanner(System.in);

        // Read User input as a string
        String input = myscan.nextLine();

        //Parse the input to an integer
        int myNum = Integer.parseInt(input);

        //Check if the number is between 0 and 9
        if (myNum >= 0 && myNum <= 9) {
            System.out.println("You entered" + myNum);
        }
        else {
            System.out.println("Not a valid number");
        }


        }
    }
}