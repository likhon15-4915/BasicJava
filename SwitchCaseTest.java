package basicjava;
import java.util.Scanner;
public class SwitchCaseTest{
    public static void main(String[] args){
        System.out.println("Enter a digit :");
        int x;
        Scanner input = new Scanner(System.in);
        x= input.nextInt();
        
        switch (x){
            case 1 :
                 System.out.println("One");
            case 2 :
                 System.out.println("Two");
            case 3 :
                 System.out.println("Three");
            case 4 :
                 System.out.println("Four");
            case 5 :
                 System.out.println("Five");
            default :
                 System.out.println("Not in (One-Five)");
            
        }
    }
}
