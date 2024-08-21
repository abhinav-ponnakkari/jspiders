import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
     String name[]={"hellen", "rohan"};
     String names[]={"hellen", "rohan"};
     System.out.println(Arrays.equals(name,names));
     System.out.println("enter the number of array elements");
     Scanner ip =new Scanner(System.in);
     int n=ip.nextInt();
     String arr[]=new String[n];
     for(int i=0;i<n;i++)
     {
        arr[i]=ip.next();
     }
     System.out.println("The elements are");

     for(int i=0;i<n;i++)
     {
        System.out.println(arr[i]);
     }
     

    }
}