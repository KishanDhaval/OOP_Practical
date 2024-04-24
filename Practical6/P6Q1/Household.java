package Practical6.P6Q1;
import Practical6.P6Q1.Product;
import Practical6.P6Q1.Place;



class Household extends Product implements Place {
    Household() {
        System.out.println("Household is added.");
    }

    @Override
    public void search() {
        System.out.println("House Hold Product Searching... \n Searching in Block Number : " + BlockNo);
    }
}
