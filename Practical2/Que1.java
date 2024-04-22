



import java.util.*;

public class Que1 {

    static boolean isArmstrong(int a){
        int x=a;
        int sum = 0,rem;
        int numberOfDigits = String.valueOf(a).length();


        while (a != 0) {
            rem = a % 10;
            sum += Math.pow(rem, numberOfDigits);
            a /= 10;
        }
        return sum==x;
    }

    static void Armstrong(int[] arr) {
        for (int ele : arr) {
            if (isArmstrong(ele)) {
                System.out.println(ele+" Is Armstrong");
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter Five nuber to check is Armstron or not:");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Armstrong NUmbers are:");
        Armstrong(arr);
    }
}
