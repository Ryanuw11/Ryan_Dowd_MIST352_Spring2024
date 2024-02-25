/**
 * Ryan Dowd 
 * HW2- 2/18/2024 
*/


import javax.swing.JOptionPane;		// Imports Joption for text windows

public class HW2 
{
	public static void main(String[] args)
	{
		//Defines everything in this program from the bases numerical value to initializing the tax and output variables along with storing gingers string value.
		double apple = 5.00;
		double orange = 4.50;
		double mango = 6.00;
		double carrot = 5.50;
		double ginger = 1.00;
		double finalequationans =0;
		double tax =0;
		final double salestaxrate = 0.16;
		double JOoutput = 0;
		double Discount = 0;
		String gingeroptionString = null;
		
		// Displays Welcome in message
		JOptionPane.showMessageDialog(null, "Welcome to Java Juice Bar!");
		
		// Displays options box asking what type of juice is wanted
		int JuiceOption =Integer.parseInt(JOptionPane.showInputDialog(null, "Select your base juice:"
				+ " \n1. Apple - $5.00 \n2. Orange - $4.50 \n3. Mango - $6.00 \n4. Carrot - $5.50 "));
		
		//Turns input of 1-4 into a juice name and price
		String JuiceOptionString = null;
		
		//Juice base switch statement that decides what's outputted based on input
		switch(JuiceOption)
		{
		case(1):
			JuiceOptionString = "Apple - $5.00";		
			break;
			
		case(2):
			JuiceOptionString = "Orange - $4.50";
			break;
			
		case(3):
			JuiceOptionString = "Mango - $6.00";
			break;
			
		case(4):
			JuiceOptionString = "Carrot - $5.50";
			break;
			
			
		default:
			JOptionPane.showMessageDialog(null, "Invaild selection. Please restart the program.");
			System.exit(0);
			break;
			
		}
		
		//Displays option to add ginger
		int gingeroption = (JOptionPane.showConfirmDialog(null, "Would you like to add ginger for an extra $1.00?", "Add Ginger", JOptionPane.YES_NO_OPTION));
		
		//if statement for yes or no option for adding ginger 
		if(gingeroption == JOptionPane.YES_OPTION) {
			gingeroptionString= "Add-On: $"+ginger+"0" +"\n---------------------\n ";
		}
			
		else if(gingeroption == JOptionPane.NO_OPTION) {
			gingeroptionString = "";
			ginger = 0;
		}
		
		//Giving case numbers a numerical value to be used in the equation
		if(JuiceOption==1) {
			JOoutput = apple;
		}
		else if(JuiceOption==2) {
			JOoutput = orange;
		}
		else if(JuiceOption==3) {
			JOoutput = mango;
		}
		else if (JuiceOption==4) {
			JOoutput = carrot;
		}
		if(gingeroption == JOptionPane.YES_OPTION && JOoutput==mango)
		{
			Discount = 0.50;
		 }
		else
		{
			Discount = 0.00;
		}
		
		//Total before tax
		double BTequation = JOoutput + ginger - Discount;
		
		//Sales tax calculation 
		tax= salestaxrate * BTequation;
		
		//Equation for final price
		finalequationans = tax + BTequation;
		
		//Formats Final Bill	
		String str = String.format("|| Final Bill ||\n---------------------\n"+"Base Juice: " +"%s" + 
		"\n "+ "%s" +"---------------------\n"+"Full Price: $"+ "%1.2f" + 
		"\nDiscount: -$"+ "%1.2f"+"\n---------------------" + 
		"\nTotal Before Tax: $" + "%1.2f" + "\nTax: $"+ "%s" + 
		"\n---------------------\n"+ "Total After Tax: $"+ "%1.2f" +"\n---------------------\n",JuiceOptionString,gingeroptionString,BTequation,Discount,BTequation,tax,finalequationans);
	
		//Displays final bill
		JOptionPane.showMessageDialog(null, str);
					
			
		
		
		
			
		
		
		
		
		
		
		
		
			
}
	
}

