/**
 * Ryan Dowd
 * MIST-352 2:30pm
 * HW3
 * 
 */


import java.util.Date;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Employee {
    private String name;
    private String dateOfBirth;
    private String role;
    private int employeeId;
    private String email;
    private double salary;
    private boolean aboveAvg ;
    private String bar;

    // Constructor 
    /**
     * You need to code this
     * This constructor accepts one line from a text file
     * It should split it up and initialize all attributes in this class using the values from the line
     * For example, name should equal to the first portion of the splited line and dateOfBirth is second and so on.
     * Lastly, set aboveAvg to false 
     * @param line
     */
    public Employee(String line)   		
    		 {
    	String[] parts = line.split(",");
    	//defines the variables for the employee data and corresponds them to each part of the txt file
    	if (parts.length >= 6) {
    		this.name= parts[0].trim();
    		this.dateOfBirth = parts[1].trim();
    		this.role = parts[2].trim();
    		this.employeeId = Integer.parseInt(parts[3].trim());
    		this.email = parts[4].trim();
    		this.salary = Double.parseDouble(parts[5].trim());
    		this.aboveAvg = false;
    		
        setAboveAvg(salary);
    }
    		 }
    /**
     * You need to code this
     * This method accepts the average salary from the main and decide whether this employee's salary is above average or not
     * If it is, then set aboveAvg to true
     * @param intAverage
     */
   public void setAboveAvg(double dblAverage)
   {
	   //if else for if the salary is above or below average
	   if(salary > dblAverage) {
		   aboveAvg = true;
		   
	   }
	   else {
		   aboveAvg= false;
	   }
   }
	
   /**
	 * You need to code this.
	 * This method accepts an employee's salary and returns a bar chart of stars representation of the salary
	 * For example, 
	 * 				if the salary is 60,000, then the bar should return 6 stars:  ******
	 * 				if the salary is 95,600, then the bar should return 9 stars:  *********
	 * @param salary: the employee salary
	 * @return bar: representation in start of the salary. Each * represents $10,000
	 */
   public String SalaryBarChart(double salary) {
	//defining the bar variable	
	String bar = "";
	  //equation for the amount of asterisks for each 10,000 of an employees salary
	int ast = (int) (salary / 10000);
		
	   
	   //for statement for calculating how many asterisks are displayed
	   for(int astchart=0; astchart < ast; astchart++) {
		   
		   bar += "*";
	   }
	   return bar;
	    	}
   
   /**
    * You need to code this.
    * This method provides a summary of each employee.
    * It returns a string formatted to include: employee name, employee ID, the bar chart of the salary, and whether salary is above average or not.
    * @return : Formatted string of employees basic information.
 * @throws FileNotFoundException 
    */
   public String SummerizeEmployee(DataSummary myData, PrintWriter writer) throws FileNotFoundException
	  {
		//summary of employee data and defining variables to be used in a String.format
	   double avgSalary = myData.getAverage();
	   bar = SalaryBarChart(salary);
	   String aboveAvg = (salary > avgSalary) ? "true" : "false";
	   String SummerizeEmployee = String.format("%s       %s %s   %s", name, employeeId, bar, aboveAvg);
	   
	   if (writer != null) {
		   writer.println(SummerizeEmployee);
	   }
	   
	   return SummerizeEmployee;
	   
	 }
	 

}