package basicjava;
import java.util.Scanner;

public class VowelConsonentTest {
    public static void main(String[] args) {
        
        System.out.println("Enter a letter :");
        char ch;
        Scanner input = new Scanner(System.in);
        ch= input.next().charAt(0);
        
        if(ch=='a'){
         System.out.println("Vowel");
        }
         
         else if (ch=='e'){
         System.out.println("Vowel");
         }  
              else if (ch=='i'){
         System.out.println("Vowel");
         }
         
          else if (ch=='o'){
         System.out.println("Vowel");
         }
         
          else if (ch=='u'){
         System.out.println("Vowel");
        }
         
         else {
         System.out.println("Consonent");}
          
    }
}
