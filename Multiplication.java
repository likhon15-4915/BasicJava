package basicjava;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
          System.out.println("Enter the value of n :");
          int n=input.nextInt();
          
        
        for (int i = 1; i <= 10; i++) {
           // res =res*i;
         System.out.println(n+" X "+i + " = "+n*i);
        }
          
    }
}
