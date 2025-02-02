package week3;

import java.util.Scanner;

//**Write a program to input any number and check if it Armstrong number or not
//153 = (1*1*1)+(5*5*5)+(3*3*3)
//where:
//(1*1*1)=1
//(5*5*5)=125
//(3*3*3)=27
//So:
//1+125+27=153
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n, count = 0, a, b, c, sum = 0;
        Scanner s = new Scanner(System.in);
        //expected outcome with logic
        System.out.print("Enter a number:");
        n = s.nextInt();
        a = n;
        c = n;

        //while loop
        while(a > 0)
        {
            a = a / 10;
            count++;
        }
        while(n > 0)
        {
            b = n % 10;
            sum = (int) (sum+Math.pow(b, count));
            n = n / 10;
        }
        if(sum == c)
        {
            //outcome if Armstrong number
            System.out.println(c+ " is an Armstrong number");
        }
        else
        {    ////outcome if not Armstrong number
            System.out.println(c+ " is not an Armstrong number");
        }
    }

}
