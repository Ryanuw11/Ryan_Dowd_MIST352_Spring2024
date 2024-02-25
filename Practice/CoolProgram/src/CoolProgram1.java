import javax.swing.JOptionPane;

public class CoolProgram1 
{

		public static void main(String [] arg) 
		{
			
	int intOption =Integer.parseInt(JOptionPane.showInputDialog(null, "Hello, Give me a Value:"
			+ " \n: \n 1,\n 2, \n or 3"));
	switch(intOption)
	{
	
	case(1):
		JOptionPane.showConfirmDialog(null, "Chose 1 Cats are fresh as hell");
		break;
		
	case(2):
		JOptionPane.showConfirmDialog(null, "Chose 2 dog stinky");
		break;
		
	case(3):
		JOptionPane.showConfirmDialog(null, "Chose 3 grow up");
		break;
		
		
	default:
		JOptionPane.showConfirmDialog(null, "Wrong Option");
		break;
		
		
	}
}
}	