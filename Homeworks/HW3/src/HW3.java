/**
 * Ryan Dowd
 * MIST-352 2:30pm
 * HW3
 * 
 */




/**
 * 
 */

/**
 * @author MJ
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class HW3 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
	//****** Keep as is *******************
		// The location of the employee text file 
		String strDataLocation ="src/EmployeeData.txt";
		String strOutputLocation ="src/EmployeeSummary.txt";
		File myFile = new File(strDataLocation);
		Scanner inputFile = new Scanner (myFile);
		PrintWriter writer =new PrintWriter(strOutputLocation);
		int intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));
		DataSummary myData = new DataSummary(strDataLocation); //mydata
	//*************************************

		//This while loop controls the options for users. Your switch statement should be embedded here.
		/**
		 * switch statement meant to give user a choice on what to search with 6 options
		 */
		while(intChoice !=0)
		{
			switch(intChoice)
			{
			case 1:
				//prints out employees name and IDs to console
				myData.ViewEmployeeAndIDs();
				break;
			case 2:
				//search for an employee by name
				myData.SearchEmployee();
				break;
			case 3:
				myData.ViewRoles();
				break;
			case 4:
				//input a role to view employees with that role
				myData.ViewEmployeeForRole();
				break;
			case 5:
				//average salary
				double avg = myData.getAverage();
				//formatting the output of the avg and displaying it
				String avge = String.format(Locale.US, "%,.2f", avg);
	               JOptionPane.showMessageDialog(null, "The Average is: $" + avge);
				
				break;
			case 6:
				File data = new File(strDataLocation);
		        Scanner scnReader = new Scanner(data);
				
				//Defining variables for the printout into console and txt file
				while (scnReader.hasNextLine()) {
					String line = scnReader.nextLine();
					Employee myemployee = new Employee(line);
					String SummerizeEmployee = myemployee.SummerizeEmployee(myData, null);
					//prints out employee summary with name, ID, asterisks for salary and if the salary is above or below average
				System.out.println(SummerizeEmployee);
				//writes summary to EmployeeSummary.txt
				writer.println(SummerizeEmployee);
				
				}
				break;
				
				//break statement if invalid input is given and ends the program
			default:
	                JOptionPane.showMessageDialog(null, "Wrong Option");
	                System.exit(0);
			}
			intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));	
		
		}
		


		writer.close();
		inputFile.close();	
		
	}
	/**	 
	 * Keep as is
	 * A method to display options
	 * @return : The options to display in the GUI
	 */
	
	public static String ViewOptions()
	{
		String strMessageToDisplay="Choose an option:"
				+ "\n0.\tExit"
				+ "\n1.\tView Employees and IDs"
				+ "\n2.\tSearch for Employee"
				+ "\n3.\tView current roles"
				+ "\n4.\tView employees for a certain role"
				+ "\n5.\tView Average Salary"
				+ "\n6.\tSummerize and Write data";
		return strMessageToDisplay;
	} }
	
	
	
	


