//1+3+5+...+n
package basicjava;
import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n  : ");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i= i+2) {
            res +=i;
        }
        System.out.println("Result : "+res);
    }
  
}
