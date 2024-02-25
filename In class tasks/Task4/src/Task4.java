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
		
		int aststore1 =0,aststore2 =0,aststore3 =0,aststore4 =0,aststore5 =0;
		for (int aststore=1;aststore<= 5;aststore++)
		  {
			System.out.println("SALES BAR CHART");
			if(aststore==1)
				aststore1 = intstore1 / 100;
			
			else if(aststore ==2)
				aststore2 = intstore2 / 100;
			
			else if(aststore ==3)
				aststore3 = intstore3 / 100;
			
			else if(aststore ==4)
				aststore4 = intstore4 / 100;
			
			else if(aststore ==5)
				aststore5 = intstore5 / 100;
			
		  
		  
		  
		  
		  }
		
		
		
		
		
		System.out.printf("Store 1: %d \nStore 2: %d \nStore 3: %d \nStore 4: %d \nStore 5: %d  ",aststore1,aststore2,aststore3,aststore4,aststore5);
		
		
		
	}
}
