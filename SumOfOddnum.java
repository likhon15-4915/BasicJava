package basicjava;

import java.util.Scanner;
public class SumOfOddnum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int m,n,sum=0;
        System.out.println("Enter the value of m :");
        m=input.nextInt();
        
        System.out.println("Enter the value of n :");
        n=input.nextInt();
        
        for (int i = m; i <= n; i++) {
            if(i % 2 !=0 ){
                continue;
            } 
           sum-=i;
          
        }
       
       System.out.println("sum"+sum );
       
       
    }
}
