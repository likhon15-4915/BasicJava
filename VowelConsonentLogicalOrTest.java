package basicjava;
import java.util.Scanner;
public class VowelConsonentLogicalOrTest {
    public static void main(String[] args){
      char ch;
      System.out.print("Enter a letter :");
      Scanner input= new Scanner(System.in);
      ch=input.next().charAt(0);
      if(ch=='a'|| ch=='e'||ch=='i'||ch=='0'||ch=='u'){
          System.out.println("Vowel");
      }
      else {
          System.out.println("Consonent");
      }
    }
    
}
