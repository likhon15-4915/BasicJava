//1^2+2^2+3^2+....+n^2
package basicjava;
import java.util.Scanner;

public class Series4 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    int res = 0;
    
    for(int i=1;i<=n;i++){
        res=res+(i*i); 
                    //1^2=1; when i=1_ i*i=1+res=o; ==1;
    }
     System.out.println("Result "+res);
    
    }
    
}
