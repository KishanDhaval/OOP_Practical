import java.util.*;

class Product{
	double MRP;
	int QUANTITY;
	void display(){
		System.out.println("MRP : "+MRP);
		System.out.println("QUANTITY : "+QUANTITY);
	}
	void setdata(double MRP,int QUANTITY){
		this.MRP=MRP;
		this.QUANTITY=QUANTITY;
	}
}

class Que1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Product p1=new Product();
		p1.setdata(2000.0,4);
		p1.display();
	}
}