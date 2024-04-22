class Account{
    int Ac_No;
    String Name;
    double Balance;

    Account(){
        System.out.println("Welcome to Bank.");
    }
    
    Account(int ac_no, String name, double balance){
        Ac_No = ac_no;
        Name = name;
        Balance = balance;
    }

    void display(){
        System.out.println("Account no. : " + Ac_No);
        System.out.println("Name : " + Name);
        System.out.println("Balance : " + Balance);
    }
}
class Que2{
    public static void main(String[] args){
        int ac_no = Integer.parseInt(args[0]);
        String name = args[1];
        double balance = Double.parseDouble(args[2]);
        
        Account a1 = new Account();
        
        Account a2 = new Account(ac_no, name, balance);
        a2.display();
    }
}
