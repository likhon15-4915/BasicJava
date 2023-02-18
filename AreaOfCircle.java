package basicjava;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
      System.out.println("Enter the radious of circle :");
      float r;
      r = input.nextByte();
      double area;
      area= 3.1416*r*r;
      System.out.println("the radious of circle :"+area);
    }
}
