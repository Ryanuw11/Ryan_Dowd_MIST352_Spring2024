
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Chapter 7
 * Programming Challenge 2: Payroll Class
 * This program demonstrates the Payroll class.
 */

public class PayrollDemo
{
   public static void main(String[] args)
   {
      int hours;        // Hours worked
      double payRate;   // Hourly pay rate

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Payroll object named pr
      Payroll pr = new Payroll();
      pr.setemployeeID();
     
      // Get the hours and pay rate for each employee.
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         // Get the hours worked.
         System.out.print("Enter the hours worked by employee " +
                          "number  "  + pr.getEmployeeIdAt(i) +
                          ": ");
         hours = keyboard.nextInt();
         
         // Validate hours worked using while hours < 0
       while (hours < 0) {
    	   hours = keyboard.nextInt();
      
       }
         
         // Get the hourly pay rate from user
       System.out.print("Enter the hourly pay rate for employee number " + pr.getEmployeeIdAt(i) + ": ");
         
         // Validate pay rate using a while payRate < 6
       payRate = keyboard.nextDouble();
      
      
       while (payRate <6) {
    	   System.out.print("ERROR: Enter 6.00 or greater for pay rate:");
    	 
    	   payRate = keyboard.nextDouble();
    	  
       }
      
         // Store the data in the pr object.
       pr.setHours(i, hours);
       pr.setPay(i, payRate);
      }
      // Create a DecimalFormat object to format output.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Display the payroll data for each employee using a for loop 
      System.out.println("PAYROLL DATA\n============");
      
      for (int L = 0; L < pr.NUM_EMPLOYEES; L++) {
      
    	  System.out.printf("Employee ID: %d \nGross pay: $%.2f\n\n",pr.getEmployeeIdAt(L),pr.getGrossPay(L));
      }	 
   
}
}