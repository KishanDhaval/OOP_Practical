package Practical12;
import Practical6.P6Q2.Account;
import java.util.ArrayList;
import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Set Account Data");
            System.out.println("2. Withdraw from an Account");
            System.out.println("3. Search for an Account");
            System.out.println("4. Delete an Account");
            System.out.println("5. Show Stored Object Data");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Account newAccount = new Account();
                    newAccount.setData();
                    accounts.add(newAccount);
                    break;
                case 2:
                    System.out.print("Enter Account no. to withdraw from: ");
                    int withdrawAccountNo = sc.nextInt();
                    boolean foundWithdraw = false;
                    for (Account acc : accounts) {
                        if (acc.Ac_No == withdrawAccountNo) {
                            acc.withdraw();
                            foundWithdraw = true;
                            break;
                        }
                    }
                    if (!foundWithdraw) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. to search for: ");
                    int searchAccountNo = sc.nextInt();
                    boolean foundSearch = false;
                    for (Account acc : accounts) {
                        if (acc.Ac_No == searchAccountNo) {
                            acc.display();
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter Account no. to delete: ");
                    int deleteAccountNo = sc.nextInt();
                    boolean foundDelete = false;
                    for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).Ac_No == deleteAccountNo) {
                            accounts.remove(i);
                            System.out.println("Account deleted successfully.");
                            foundDelete = true;
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Account not found!");
                    }
                    break;
                case 5:
                    System.out.println("Stored Object Data:");
                    for (Account acc : accounts) {
                        acc.display();
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
    }
}
