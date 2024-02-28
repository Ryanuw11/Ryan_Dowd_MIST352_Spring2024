
public class Loop {

	public static void main(String[] args) {
		int loopsum =0;
		int loopsum2 = 5050;
	for (int loopoh=1; loopoh<=100; loopoh++) {
		loopsum += loopoh;
			
			
			System.out.println(loopoh +" " +loopsum);
			
		
	}

	for (int loopin = 100; loopin > 1; loopin--) {
		loopsum2 -= loopin;
		
		System.out.println(loopin-1 + " "+loopsum2);
		
	}
	
	
	
	}
}