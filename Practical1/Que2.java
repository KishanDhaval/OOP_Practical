//Find Simple Interest

import java.util.*;
public class Que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P;
        double N ,R;

        System.out.println("Enter Amount");
        P=sc.nextInt();
        System.out.println("Enter Interest");
        N=sc.nextDouble();
        System.out.println("Enter Number of Year");
        R=sc.nextDouble();


        System.out.println("Simple interest : "+(P*R*N)/100.0);
    }
}
