package week3;
//**Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 10; // Number of terms to be printed

        int num1 = 1, num2 = 1;

        //expected outcome to print
        System.out.print("Fibonacci numbers  ");

        //logic of outcome
        for (int i = 1; i <= n; ++i) {

            //what to print
            System.out.print(num1 + " ");


            //sum of the outcome
            int sum = num1 + num2;

            num1 = num2;

            num2 = sum;
        }
    }
}