import java.util.Scanner;

class Que2
{
    public static void main(String[] args)
    {
        String[] arr = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any five strings : ");

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextLine();
        }

        String temp;
        for(int i = 0 ; i < arr.length - 1; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i].compareTo(arr[j]) > 0)
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Strings in sorted order are :  ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}