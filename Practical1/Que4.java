
import java.util.*;

import java.util.Scanner;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.signum;

public class Que4 {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter Two Binary Number");
        a=sc.nextInt();
        b=sc.nextInt();
  int carry = 0;
        int result = 0;
        int temp = 1;

        while (a != 0 || b != 0 || carry != 0) {
            int rem1 = a % 10;
            int rem2 = b % 10;

           
            int sum = rem1 + rem2 + carry;

           
            result += (sum % 2) * temp;
            carry = sum / 2;

          
            temp *= 10;

            // Move to the next bits
            a /= 10;
            b /= 10;
        }
        System.out.println( result);


    }
}
