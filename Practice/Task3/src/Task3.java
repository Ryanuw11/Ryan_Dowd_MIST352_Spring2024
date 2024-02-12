import javax.swing.JOptionPane;


public class Task3 {

	public static void main(String[] args) {
		
		double moneydeposited = Double.parseDouble(JOptionPane.showInputDialog("How much money was orginally deposited into the account?"));
		
		
		double rate = Double.parseDouble(JOptionPane.showInputDialog("What is the interest rate percentage paid by the account?"));
		
		
		double compounded = Double.parseDouble(JOptionPane.showInputDialog("How many times a year is the interest compounded?"));
		
		
		double yearsleft = Double.parseDouble(JOptionPane.showInputDialog("How many years will the account be left to earn interest?"));
		
		double result = moneydeposited *  1 + (Math.pow(rate,( compounded / yearsleft)))/ compounded;
		
		System.out.println("Heres the amount of money that would be in the account "+ result +"");
	}
}
