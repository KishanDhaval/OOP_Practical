package Practical6.P6Q2;

import java.util.Scanner;

public class Account {
    public int Ac_No;
    public String Name;
    public double Balance;

    public void display() {
        System.out.println("Account no. : " + Ac_No);
        System.out.println("Name : " + Name);
        System.out.println("Balance : " + Balance);
        System.out.println();
    }

    public void setData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account no. : ");
        this.Ac_No = sc.nextInt();

        System.out.print("Enter the name : ");
        this.Name = sc.next();

        System.out.print("Enter the Balance : ");
        this.Balance = sc.nextDouble();
        System.out.println();
    }

   public  void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to deposit : ");
        double Deposit = sc.nextDouble();

        Balance = Balance + Deposit;
    }

   public void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw : ");
        double Withdraw = sc.nextDouble();

        if (Withdraw <= Balance) {
            Balance = Balance - Withdraw;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
