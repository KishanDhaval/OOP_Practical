package Practical6.P6Q1;

import Practical6.P6Q1.Product;
import Practical6.P6Q1.Place;


public class Crockery extends Product implements Place {
    Crockery() {
        System.out.println("Crockery is added.");
    }

    @Override
    public void search() {
        System.out.println("Crockery Product Searching... \n Searching in Block Number : " + BlockNo);
    }
}
