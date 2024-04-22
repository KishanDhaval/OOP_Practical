
import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Enter Year You want to chack");
        year=sc.nextInt();
        if(year%4==0 || year%400==0){
            System.out.println(year + " is Leap year");
        }else{
            System.out.println(year+ " is not Leap year");
        }
    }
}
