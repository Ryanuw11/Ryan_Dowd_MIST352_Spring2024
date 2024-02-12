// Author: [Ryan Dowd]
// Class: MIST352-Spring24
// HW #1
// [The point of this program is to print out a greeting message alongside different number values that can be inputted by the user and to confirm that its true that the decimal number is 3.14]

import java.util.Scanner;		// importing the scanner class
    
public class HW1B {
	
	
	public static <nValue> void main(String[] args) {		
		
		Scanner usrIP = new Scanner(System.in); // creating scanner object
		
		System.out.println("Hello World\n");		
		
		System.out.println("\tTabbed text");
		
		System.out.println("Enter value for numberAsString"); // lines 19 24 are system prompting user for answer
		
		String numberAsString = usrIP.nextLine();
		System.out.println("Value of numberAsString is: " + numberAsString);
		
		System.out.println("Enter value for number");
																	// lines 21 26 read user inputs while lines 22 27 output the user input
		String number = usrIP.next();
		System.out.println("Value of Number is: " + number);
		
		boolean flag = "true" != null;   
		
		double decimalNumber = 3.14f;				
		
		System.out.println("The value of flag is " + flag + ", and the decimal number "
				+ "is " + decimalNumber);
		
			
	}


	 
}