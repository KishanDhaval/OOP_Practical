import java.util.*;

interface Branch {
    void setBranch();
}

class Account {
    int Ac_No;
    String Name;
    double Balance;

    void display() {
        System.out.println("Account no. : " + Ac_No);
        System.out.println("Name : " + Name);
        System.out.println("Balance : " + Balance);
    }

    void setData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Account no. : ");
        this.Ac_No = sc.nextInt();

        System.out.print("Enter the name : ");
        this.Name = sc.next();

        System.out.print("Enter the Balance : ");
        this.Balance = sc.nextDouble();
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount to deposit : ");
        double Deposit = sc.nextDouble();

        Balance += Deposit;
    }
}

class Savings extends Account implements Branch {
    String BranchName;

    Savings() {
        System.out.println("Savings account created.");
    }

    public void setBranch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Branch Name : ");
        this.BranchName = sc.next();
    }

    void display() {
        super.display();
        System.out.println("Branch Name: " + BranchName);
    }
}

class Current extends Account implements Branch {
    String BranchName;

    Current() {
        System.out.println("Current account created.");
    }

    public void setBranch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Branch Name : ");
        this.BranchName = sc.next();
    }


    void display() {
        super.display();
        System.out.println("Branch Name: " + BranchName);
    }
}

class Que2 {
    public static void arraylist() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        System.out.println("How many Savings Account :");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            Savings s = new Savings();
            s.setBranch();
            s.setData();
            accounts.add(s);
        }

        System.out.println("How many Current Account :");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            Current c = new Current();
            c.setBranch();
            c.setData();
            accounts.add(c);
        }

        // Displaying all accounts
        System.out.println("Accounts Details!!:");
        for (Account acc : accounts) {
            acc.display();
        }
    }

    public static void main(String[] args) {
        arraylist();
    }
}
