package basicjava;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        int num;
        System.out.println("Enter your number : ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        if(num>=0 & num<=39){
            System.out.println("Your grade is F, Try again");
        }
        else if(num>39 & num <=44){
            System.out.println("Your grade is D");
        } 
         else if(num>44 & num <=49){
            System.out.println("Your grade is C");
        } 
         else if(num>49 & num <=54){
            System.out.println("Your grade is C+");
        } 
         else if(num>54 & num <=59){
            System.out.println("Your grade is B-");
        } 
         else if(num>59 & num <=64){
            System.out.println("Your grade is B");
        } 
         else if(num>64 & num <=69){
            System.out.println("Your grade is B+");
        } 
         else if(num>69 & num <=74){
            System.out.println("Your grade is A-");
        } 
         else if(num>74 & num <=79){
            System.out.println("Your grade is A");
        } 
         else if(num>79 & num <=100){
            System.out.println("Your grade is A+");
        } 
         else{
             System.out.println("Invalid Input");
         }
    }
}
