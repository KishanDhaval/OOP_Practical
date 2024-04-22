
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

interface Branch {
    void setBranch(String b);
}

class Account {
    int Ac_No;
    String Name;
    double Balance;
    String BranchName;

    Account(int ac_No, String name, double balance) {
        this.Ac_No = ac_No;
        this.Name = name;
        this.Balance = balance;
    }
}

class Savings extends Account implements Branch {

    Savings(int ac_No, String name, double balance) {
        super(ac_No, name, balance);
        System.out.println("Savings account created.");
    }

    @Override
    public void setBranch(String b) {
        this.BranchName = b;
    }
}

class Current extends Account implements Branch {

    Current(int ac_No, String name, double balance) {
        super(ac_No, name, balance);
        System.out.println("Current account created.");
    }

    @Override
    public void setBranch(String b) {
        this.BranchName = b;
    }
}

public class Que2 {
    public static void arraylist() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        Savings s = new Savings(22028100, "Kishan", 20000);
        s.setBranch("BOB");
        accounts.add(s);

        Current c = new Current(22029099, "Yash", 10000);
        c.setBranch("SBI");
        accounts.add(c);

        writeToTextFile(accounts);
    }

    private static void writeToTextFile(ArrayList<Account> accounts) {
        try (FileWriter writer = new FileWriter("accountdata.txt")) {
            for (Account acc : accounts) {
                writer.write("\nAccount Information\n");
                writer.write("Account Number: " + acc.Ac_No + "\n");
                writer.write("Account Name: " + acc.Name + "\n");
                writer.write("Balance: " + acc.Balance + "\n");
                writer.write("Branch Name: " + acc.BranchName + "\n");
                writer.write("---------------------------\n");
            }

            System.out.println("Data stored to accountdata.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving account data to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        arraylist();
    }
}
