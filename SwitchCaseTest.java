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
                 break;
            case 2 :
                 System.out.println("Two");
                 break;
            case 3 :
                 System.out.println("Three");
                 break;
            case 4 :
                 System.out.println("Four");
                 break;
            case 5 :
                 System.out.println("Five");
                 break;
                 
            default :
                 System.out.println("Not in (One-Five)");
            
        }
    }
}
