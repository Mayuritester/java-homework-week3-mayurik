package week3;
//**-Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.
//-Before the user enters the number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum
//number.

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    // Main method
    public static void main(String[] args) {
        //call the scanner and variables
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 1;
        boolean first = true;
        // while method
        while (true) {
            //request user to enter number
            System.out.println("Enter the number:");
            int number = scanner.nextInt();
            //logic
            if (scanner.hasNextInt()) {
                if (first) {
                    min = number;
                    max = number;
                    first = false;
                } else {
                    if (number < min) {
                        min = number;
                    }
                    if (number > max){
                        max = number;
                    }
                }
            } else {
             // expected output
                System.out.println("Min number is: " + min);
                System.out.println("Max Number is: " + max);
                break;
            }scanner.close();


        }

    }

}




