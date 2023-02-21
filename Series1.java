//1+2+3+.....+n

package basicjava;
import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
    Scanner input =new Scanner(System.in);
    int n= input.nextInt();
    int res=0;
    
        for (int i = 1; i <=n; i++) {
            res= res+i;
        }
    System.out.println("Result : "+res);
    }
    
}
