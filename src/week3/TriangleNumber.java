package week3;

//**Write a program in Java to display the pattern like a triangle with a number.
//For eg.
//Input number of rows: 10
//Expected Output:
//1
//12
//123
//1234
//12345
//123456
//1234567
//12345678
//123456789
//12345678910
public class TriangleNumber {
    //main method
    public static void main(String[] args) {
        //logic
        for (int i = 1; i <= 10; i++) {

            // loop to print the number of spaces before the star
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            //for nre line after printing each row
            System.out.println();
        }
    }
}
