import java.util.Scanner;

class Account
{
    int Ac_No;
    String Name;
    double Balance;

    void display()
    {
        System.out.println("Account no. : " + Ac_No);
        System.out.println("Name : " + Name);
        System.out.println("Balance : " + Balance);
    }

    void setData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account no. : ");
        this.Ac_No = sc.nextInt();

        System.out.print("Enter the name : ");
        this.Name = sc.next();

        System.out.print("Enter the Balance : ");
        this.Balance = sc.nextDouble();
    }

    void deposit()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to deposit : ");
        double Deposit = sc.nextDouble();

        Balance = Balance + Deposit;
    }
}

class Savings extends Account
{
    Savings()
    {
        System.out.println("Savings is added.");
    }
}

class Current extends Account
{
    Current()
    {
        System.out.println("Current is added.");
    }
}

class Que2
{
    public static void main(String[] args)
    {
        Savings s1 = new Savings();
        s1.setData();
        s1.display();
        s1.deposit();
        s1.display();
        System.out.println();

        Current c1 = new Current();
        c1.setData();
        c1.display();
        c1.deposit();
        c1.display();
    }

}
