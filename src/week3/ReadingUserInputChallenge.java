package week3;

import java.util.Scanner;

//**Read 10 numbers from the console entered by the user and print the sum of those
//numbers.
//-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
//10 numbers.
//-Use the nextInt() method to get the number and add it to the sum.
//-Before the user enters each number, print the message Enter number #x: where x represents the
//count, i.e. 1, 2, 3, 4, etc.
//-For example, the first message printed to the user would be Enter number #1:, the next Enter number
//and so on
public class ReadingUserInputChallenge {
    //main method with variables
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;
        //while nested logic
        while (count <= 10) {
            System.out.println("enter number " + count);

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
                scanner.next();
            }
        }//expected outcome
        System.out.println("The sum of the 10 number is: " + sum);
        //expercted outcome
        scanner.close();

    }

}




