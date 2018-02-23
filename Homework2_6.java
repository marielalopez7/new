import java.util.Scanner;

public class Homework2_6 {
         public static void main(String[] args){
         
         //Create scanner object
         Scanner scanner = new Scanner(System.in);
         
         //Get monthly saving amount deposit
         System.out.print("Enter monthly saving amount: ");
         double deposit = scanner.nextDouble();
         
         //compute annual interest rate for 6 months
         
         double balance = deposit * (1 + 0.00417);
         double original = balance;
         
         double month2 = (original + deposit) * (1 + 0.00417);
         //month2 = balance; this didn't work 
         
         double month3 = (month2 + deposit) * (1 + 0.00417);
         //month3 = balance;
         
         double month4 = (month3 + deposit) * (1 + 0.00417);
         //month4 = balance;
                 
         double month5 = (month4 + deposit) * (1 + 0.00417);
         //month5 = balance;
         
         double month6 = (month5 + deposit) * (1 + 0.00417);
         //month6 = balance;
         
         //display result
         System.out.println("Month 1: " +original);
         System.out.println("\nMonth 2: " +month2);
         System.out.println("\nMonth 3: " +month3);
         System.out.println("\nMonth 4: " +month4);
         System.out.println("\nMonth 5: " +month5);
         System.out.println("\nMonth 6: " +month6); 
         
         
         }
         
}
