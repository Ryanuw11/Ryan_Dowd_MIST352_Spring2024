import javax.swing.JOptionPane;
public class Task2 {
	
	public static void main(String[] args) {
		
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		String age = JOptionPane.showInputDialog("What is your age?");
		
		String city = JOptionPane.showInputDialog("What is the name of your city?");
		
		String college = JOptionPane.showInputDialog("What is the name of your college?");
		
		String profession = JOptionPane.showInputDialog("What is your profession?");
		
		String animal = JOptionPane.showInputDialog("Input a type of animal");
		
		String petname = JOptionPane.showInputDialog("What is your pets name?");
		
		System.out.printf( "There once was a person named "+ name +" who lived in "+ city +". At the age of "+ age +", "+ name +"%n went to" 
				+ "college at "+ college +". "+ name +" graduated and went to work as a "+ profession +". Then, "+ name +" "
						+"%n adopted a(n) "+ animal +" named "+ petname +". They both lived happily ever after!");
	
		
	}
	

}
