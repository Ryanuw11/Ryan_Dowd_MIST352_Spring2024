// Author: [Ryan Dowd]
// Class: MIST352-Spring24
// HW #1
// [The point of this program is to print out a greeting message alongside different number values and to confirm that its true that the decimal number is 3.14]


    // Public class name incorrect changed from ErrorProneProgram to HW1
public class HW1 {
	
	// Added "nValue" fixed syntax error further down in code"
	public static <nValue> void main(String[] args) {		
		
		// Declaring a string variable
		// Changed int to String since int shouldn't be used to define a string
		String numberAsString = "1234";		
		
		// Declaring an integer variable
		// Adding quotation marks fixed error
		String number = "5678";			
		
		// Declaring a boolean variable
		// != null added to complete boolean statement 
		boolean flag = "true" != null;   
		
		// Declaring a double variable
		//Changing double to float fixed error 
		double decimalNumber = 3.14f;		
		
		// Printing out a greeting message with new line
		// Missing quotation marks, adding them fixed syntax error
		System.out.println("Hello World\n");		
		
		// Printing tabbed text
		// Missing quotation marks, added
		System.out.println("\tTabbed text");		
		
		// Concatenating string with integer using escape sequences
		// Missing quotation mark ending at \t was added fixing error
		System.out.println("Value of number:\t" + number + 
	"\nValue of numberAsString:\t" + numberAsString);
		
		// Printing a complex message
		// Line worked correctly without error
		System.out.println("The value of flag is " + flag + ", and the decimal number "
				+ "is " + decimalNumber);
		
			
	}


	 
}