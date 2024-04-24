package Practical6.P6Q2;

import Practical6.P6Q2.Account;
import Practical6.P6Q2.Savings;
import Practical6.P6Q2.Branch;
import Practical6.P6Q2.Current;




class Que2
{
    public static void main(String[] args)
    {
        Savings s1 = new Savings();
        s1.setData();
	s1.search();
        s1.display();
        s1.deposit();
        s1.display();
        System.out.println();

        Current c1 = new Current();
        c1.setData();
	c1.search();
        c1.display();
        c1.deposit();
        c1.display();
    }

}
