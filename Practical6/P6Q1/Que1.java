package Practical6.P6Q1;

import Practical6.P6Q1.Product;
import Practical6.P6Q1.Crockery;
import Practical6.P6Q1.Household;
import Practical6.P6Q1.Food_items;
import java.util.Scanner;


public class Que1 {
    public static void main(String[] args) {
        Crockery c1 = new Crockery();
        c1.setdata();
        c1.search();
        c1.display();
        System.out.println();

        Household h1 = new Household();
        h1.setdata();
        h1.search();
        h1.display();
        System.out.println();

        Food_items f1 = new Food_items();
        f1.setdata();
        f1.search();
        f1.display();
	
    }
}
