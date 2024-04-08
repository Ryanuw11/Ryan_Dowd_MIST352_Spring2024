
/**
 * Chapter 7
 * Programming Challenge 2: Payroll Class
 * The Payroll class stores information 
 * about employee's payroll data using
 * parallel arrays.
 * You need to code the whole thing
 */

public class Payroll
{
	
   
	// Constant for the number of employees
   final int NUM_EMPLOYEES =7;
   // Array of employee ID numbers
   int[] employeeID = new int[NUM_EMPLOYEES];
   // Array to hold hours worked
   int[] hours = new int[NUM_EMPLOYEES];
   // Array to hold pay rates
   int[] pay = new int[NUM_EMPLOYEES];
   // Array to hold wages earned
   int[] wages = new int[NUM_EMPLOYEES];
  
	/**
	 * 
	 * @param i the location of the employee in the array
	 * @return Returns the gross pay (hours * payRate) for the employee whose data is stored at element i of each array.
	 */
   public double getGrossPay(int index) {
	   
   
   
   return hours[index] * pay[index];
   }
   
   
   /**
    * Setter for the EmployeeID
    * @param i: location of the employee in the array employeeID
    * @param id : The ID for this employee
    */
   		public void  setemployeeID() {
	  
   			employeeID[0] = 5658845;
   			employeeID[1] = 4520125;
   			employeeID[2] = 7895122;
   			employeeID[3] =	8777541;
   			employeeID[4] = 8451277;
   			employeeID[5] =	1302850;
   			employeeID[6] =	7580489;
   			
   			}

  
   /**
    * Setter for the Hours
    * @param i: location of the employee in the array hours
    * @param h : the hours for that employee
    */
   		public void setHours(int index, int setHours) {
   			
   			hours[index] = setHours;
   			
   		}
  

               
   /**
    * Setter for payRate 
    * @param i: location of the employee in the array payRate
    * @param p : the pay rate for that employee
    */
   		public void setPay(int index, double setPay) {
   			
   			pay[index] = (int) setPay;
   			
   			
   		}
   		
   		
   		
   		
   		
   /**
    * setWagesAt method
    */
    /**
    * Setter for wages
    * @param i: location of the employee in the wages  payRate
    * @param w : the wage for that employee
    */

       public void setWages(int index, double setWages) {
    	   
    	   wages[index] = (int) setWages;
       }

  
   /**
    * Getter for EmployeeID
    * @param i : location of the employee in the EmployeeID array
 * @return 
    * @return
    */
       public int getEmployeeIdAt(int index) {
    	  
    	  
      return employeeID[index];
       }
  

   /**
    * Getter for hours
    * @param i : location of the employee in the hours array
    * @return
    */
       public int getHours(int index) {
    	   
    	   return hours[index];
       }
 

   /**
    * Getter for payRate
    * @param i : location of the employee in the payRate array
    * @return
    */
       public int getPay(int index) {
    	   
    	   return pay[index];
       }

   /**
    * Getter for wages
    * @param i : location of the employee in the wages array
    * @return
    */
	public int getWages(int index) {
		
		return wages[index];
	}
 
}
 
