class Product
{
    double MRP;
    int QUANTITY;

    Product()
    {
        System.out.println("Welcome to Super-Market.");
    }

    Product(double mrp, int quantity)
    {
        MRP = mrp;
        QUANTITY = quantity;
    }

    void display()
    {
        System.out.println("MRP : " + MRP);
        System.out.println("QUANTITY : " + QUANTITY);
    }
}
class Que1{
    public static void main(String[] args)
    {
        double mrp = Double.parseDouble(args[0]);
        int quantity = Integer.parseInt(args[1]);

        Product p1 = new Product();

        Product p2 = new Product(mrp, quantity);
        p2.display();
    }
}
