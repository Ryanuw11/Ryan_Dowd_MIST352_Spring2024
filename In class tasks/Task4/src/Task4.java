import java.util.Scanner;

public class Task4 {

	public static void main(String[] args){
		
		Scanner scnUser = new Scanner(System.in);
		
		int intstore1=0,intstore2=0,intstore3=0,intstore4=0,intstore5=0;
		
		
		for (int intstores=1;intstores<= 5;intstores++) 
		{
			
		System.out.println("Enter today's sales for store"+intstores+":");
			if(intstores ==1)
				intstore1= scnUser.nextInt();
			
			else if (intstores == 2)
				intstore2= scnUser.nextInt();
			
			else if (intstores == 3)
				intstore3= scnUser.nextInt();
			
			else if (intstores == 4)
				intstore4= scnUser.nextInt();
			
			else if (intstores == 5);
				intstore5= scnUser.nextInt();
		}
		
		for(intstore1=1;intstore1<=1;intstore1++) {
			
			System.out.print("*");
		}
		
		
		
		
		
	}
}
