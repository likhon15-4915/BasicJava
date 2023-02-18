package basicjava;
import java.util.Scanner;
public class LetterSmallCapTest {
    public static void main(String[] args){
       char ch;
       System.out.print("Enter a letter :");
       Scanner input =new Scanner(System.in);
       ch= input.next().charAt(0);
       if(ch>='a' && ch<='z'){
           System.out.print("Small letter");
       }
       else if (ch>='A' && ch<='Z'){
        System.out.print("Capital Letter");
        }
       else {System.out.print("Invalid Input");}
    }
}
