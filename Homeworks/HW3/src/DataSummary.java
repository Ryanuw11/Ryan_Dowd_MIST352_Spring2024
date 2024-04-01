/**
 * Ryan Dowd
 * MIST-352 2:30pm
 * HW3
 * CHATGPT was used for this class only. 
 * Prompt 1: How would I format my strline to output Name x ID x in console
 * Prompt 2: im trying to get the average salries in a txt document to display how would I do that
 * Prompt 3: the avg is showing 0.0, any insight?
 * Prompt 4: The formatting for avg is correct but it has way too many lines of code for such a simple action. Any way to shorten it?
 * Prompt 5:when it run the program it shows the average first in a pop up window no matter what case i choose and we dont want that how would i get rid of that
 *
 *
 */





import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author MJ
 *
 */
public class DataSummary {
	private String fileLocation;
	private double averageSalary;
	
	/**
	 * Keep as is
	 * Constructor. 
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();
		
	}
	
	/**
	 * You need to code this
	 * This method opens the employee data file and returns the average salary of all employees in the data
	 * @param strFile: Location of the text file from the main
	 * @return dblSum: the Average of all salaries
	 * @throws FileNotFoundException: if file is not found, this is thrown
	 */
	public double getAverage() throws FileNotFoundException
	{
		//defining variables for the avg equation
		double avg = this.averageSalary;
		double totalSalary=0;
		int count=0;
		
        
		File data = new File(fileLocation);
        Scanner scnReader = new Scanner(data);
        while (scnReader.hasNextLine()) {
            String strLine = scnReader.nextLine();
            String[] parts = strLine.split(",");
            
            if (parts.length >= 6) {
                try {
                    double salary = Double.parseDouble(parts[5].trim());
                    totalSalary += salary;
                    count++;
                } finally {
          
                }
            }
        }
               scnReader.close();
               //equation for avg along with a string format for a decimal place and the show msg to display the avg
               avg = count > 0 ? totalSalary / count : 0;
              
               

        return avg;
		
		
		}
		
	

	/**
	 * You need to code this
	 * This method should printout all employees and their IDs to the console.
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeAndIDs() throws FileNotFoundException
	{
		File data = new File(fileLocation);
		Scanner scnReader = new Scanner(data);
		
		while(scnReader.hasNext()) {
			String strLine = scnReader.nextLine();
			//Turns the file output into a usable string for println
			String[] parts = strLine.split(",");
            //Gives a value to each part of the output
			if (parts.length >= 6) { 
                String name = parts[0];
                String id = parts[3];
			//prints out the employees name and ID to console
                System.out.println("Name: 	" + name + "  ID: 	" + id);
		
            }
		}
		scnReader.close();
		
	}
	
	
	/**
	 * You need to code this
	 * This method accepts an employee name (first, last, or both) and searches for all employee with that name
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strEmployee: Employee name 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void SearchEmployee() throws FileNotFoundException
	{
		String searchEmployee = JOptionPane.showInputDialog("Enter an employee name to search for: ");
        StringBuilder strEmployee = new StringBuilder();
		File data = new File(fileLocation);
        Scanner scnReader = new Scanner(data);
        
        while (scnReader.hasNext()) {
            String strLine = scnReader.nextLine();
            //Defines a string to give the txt document values a value in this class
            String[] parts = strLine.split(",");
           
            if (parts.length >= 6) {
                
            	//If statement for checking if the searchemployee value equals the value in the txt document to display it
                if (parts[0].equalsIgnoreCase(searchEmployee) || parts[1].equalsIgnoreCase(searchEmployee) || (parts[0] + " " + parts[1]).toLowerCase().contains(searchEmployee.toLowerCase())) {
                    
                //When a match is found from the txt document it appends the value to the string builder alongside pulling the different parts of the employeedata to display
                strEmployee.append(parts[0]).append(",").append(" ").append(parts[1]).append(",").append(parts[2]).append(",").append(parts[4]).append(",").append(parts[5]).append("\n");
                }
            } 
               
        }
        
            scnReader.close();
            
            //Joption for displaying whether an employee is found or not
           if(strEmployee.length() > 0) {
               JOptionPane.showMessageDialog(null, strEmployee);
           } else {
               JOptionPane.showMessageDialog(null, "Not Found '" + searchEmployee + "'.");
           }
        }
        
	
	
	/**
	 * You need to code this
	 * This method accepts an employee role (i.e., position) and views for all employee in that role
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strRole: Employee role 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeForRole() throws FileNotFoundException
	{
		String searchERole = JOptionPane.showInputDialog("Provide role to view employees");
        StringBuilder strRole = new StringBuilder();
		File data = new File(fileLocation);
        Scanner scnReader = new Scanner(data);
       
        while (scnReader.hasNext()) {
            String strLine = scnReader.nextLine();
            String[] parts = strLine.split(",");
        
            if (parts.length >= 6) {
               
            	//this code is very similar to the searchemployee class but this takes the role value from the file and searches for it and gives it a value in this class
            	if (parts[2].toLowerCase().contains(searchERole.toLowerCase())) {
                    
            	//When a match is found from the txt document it appends the value to the string builder and displays the name, number, and email
                strRole.append(parts[0]).append(",").append(" ").append(parts[3]).append(",").append(parts[4]).append("\n");
        
        
                }
            }
        
	}
                scnReader.close();
                //jOption pane for diplaying role upon finding it
                if(strRole.length() > 0) {
                    JOptionPane.showMessageDialog(null, strRole);
                } else {
                    JOptionPane.showMessageDialog(null, "Not Found '" + searchERole + "'.");
                }
	}
	/**
	 * Keep as is.
	 * This method displays the distinct roles in the text file
	 * @throws FileNotFoundException 
	 */
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }
	
}