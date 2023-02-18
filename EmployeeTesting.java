package basicjava;
import java.util.Scanner;

public class EmployeeTesting {
    public static void main(String[] args) {
        System.out.println("Have you completed your masters?\nPress y for YES and n for NO");
        char x,x2;
        Scanner input = new Scanner(System.in);
        
        x = input.next().charAt(0);
        System.out.println("Are you fulent in English?\nPress y for YES and n for NO");
     
        x2 = input.next().charAt(0);
        
        if ((x=='y') && (x2=='y')){
            System.out.println("You are eligible for the job interview");
        }
        else {
           System.out.println("Sorry. you are not eligible for the job interview");
        }
    }
}

