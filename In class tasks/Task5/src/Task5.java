import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		int occupied=0;
		int floors=0;
		int rooms=0;
		int sumofrooms=0;
		int sumofoccupied=0;
		int sumofvacant=0;
		double occupancyrate=0.0;
		final int min_floors=1;
		final int min_rooms=10;
		
		
		//defining scanner object for user input
		 Scanner usrinput = new Scanner(System.in);
		 
		 System.out.println("How many floors does the hotel have?");
		
		 floors = usrinput.nextInt();
	for(int floorstin =1; floorstin<=floors; floorstin++) { 
		 //while loop for invalid floor input
		
		while (floors <min_floors)
	      {
			if(floors==0) {
	          System.out.println("Invalid. Enter 1 or more:");
			}    
			else {                    
	          System.out.print("How many floors does the hotel have?");
	                          
	          floors = usrinput.nextInt();
			}
	      }
		 System.out.println("How many rooms will floor "+floorstin+" have?");
		 
		 rooms = usrinput.nextInt();
	          while(rooms <min_rooms) {
	    	  System.out.println("Invaild. Enter "+min_rooms+" or more:");
	    	  
	          System.out.println("How many rooms will floor"+floorstin+" have?");
	      	    
	          rooms =  usrinput.nextInt();
	      }
		 System.out.println("How many occupied rooms does floor"+floorstin+" have?");
		 
		 occupied = usrinput.nextInt();
		 	while(occupied > rooms) {
		 		System.out.println("Invaild. Must be "+rooms+" or less. Re-enter:");
		 		
		 		System.out.println("How many occupied rooms does floor"+floorstin+" have?");
		 		
		 		occupied = usrinput.nextInt();
	
		 	}
		 	sumofrooms += rooms;
		 	sumofoccupied += occupied;
		 	
		 	
			
	
	}
	sumofvacant = sumofrooms - sumofoccupied;
 	occupancyrate = ((double) sumofoccupied) /  sumofrooms; 
	
	
		System.out.printf("Number of rooms: "+sumofrooms+""+
		"\nOccupied rooms: "+sumofoccupied+"\nVacant rooms: "+sumofvacant+""
				+"\nOccupancy rate: "+ "%1.15f" ,occupancyrate);
 
		
		
	}
}
