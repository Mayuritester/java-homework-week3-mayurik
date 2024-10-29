package week3;
//** Display left angle triangle of * using nested for loops
//*
//* *
//* * *
//* * * *
//* * * * *

public class LeftAngleTraingle {

    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            //logic with expected output
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            //next line printout
            System.out.println("");
        }
    }



}
