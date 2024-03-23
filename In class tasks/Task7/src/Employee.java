import javax.swing.JOptionPane;

public class Employee {
	
	String name;
	int idNumber;
	String department;
	String position;
	
	/**
	 * 
	 */
	public Employee () {
	
	}
	/**
	 * 
	 * @param name
	 * @param idNumber
	 * @param position
	 * @param department
	 */
	
	public Employee (String name, int idNumber, String position,String department) 
	{
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
				
		
		
	}
	
	public Employee (String name, int idNumber)
	{
		this.name = name;
		this.idNumber = idNumber;
	}
	
	public void setName(String nam) {
		name = nam;
	}
	
	public void setidNumber(int ID) {
		idNumber= ID;
	}
	
	public void setDepartmentid(String depart) {
		department = depart;
	}
	
	public void setPosition(String Posi) {
		position= Posi;
	}
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	public int getIDNumber() {
		return idNumber;
	}
	public String getPosition() {
		return position;
	}
	public String getDepartment() {
		return department;
	}
	
	
	public void displayInfo()
	{

		JOptionPane.showMessageDialog(null,"Employee: "+getName()+" has the ID "+getIDNumber()+" and works "
				+ "as a "+getPosition()+" in the "+getDepartment()+" department");
			
	}
	
	
	


	
	
}

