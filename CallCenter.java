package basicjava;
import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args){
       System.out.println("Press 1 for Bengali\nPress 2 for Hindi\nPress 3 for Urdhu");
       System.out.println("Press others for English");
       
       int x;
       Scanner input = new Scanner(System.in);
       x= input.nextInt();
       
       switch (x){
           case 1 -> System.out.println("Selected language is Bengali");
           case 2 -> System.out.println("Selected language is Hindi");
           case 3 -> System.out.println("Selected language is Urdhu");
           default -> System.out.println("Selected language is English");
       }
    }
}
