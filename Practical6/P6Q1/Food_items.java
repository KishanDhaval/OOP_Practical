package Practical6.P6Q1;
import Practical6.P6Q1.Product;
import Practical6.P6Q1.Place;



class Food_items extends Product implements Place {
    Food_items() {
        System.out.println("Food_items is added.");
    }

    @Override
    public void search() {
        System.out.println("Food Items Searching... \n Searching in Block Number :  " + BlockNo);
    }
}