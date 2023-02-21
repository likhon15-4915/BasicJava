package basicjava;

import java.util.Scanner;
public class InputNFactorial {
    public static void main(String[] args) {
        int n,i;
        double result=1;
        System.out.println("Enter the value of n :");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        
        for ( i =1; i <=n; i++) {
            result=i*result ;
            }
        System.out.println(""+result);
    }
}
