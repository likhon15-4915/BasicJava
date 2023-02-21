//1.5+2.5+3.5+....+n
package basicjava;
import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    double res = 0;
    
    for(double i=1.5;i<=n;i++){
        res+=i;
    }
     System.out.println("Result "+res);
    
    }
    
}
