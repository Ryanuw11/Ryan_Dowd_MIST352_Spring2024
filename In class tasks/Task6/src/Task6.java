import java.util.Scanner;
import java.io.IOException;
import java.io.*;
public class Task6 {

	   public static void main(String[] args ) 
			   throws IOException
	   {
		   
		  String filename = ("DescriptionData.html");
		  File file = new File ("C:\\Users\\rdowd\\OneDrive\\Desktop");
		   Scanner usrinput = new Scanner(System.in);
	   
		   PrintWriter outputfile= new PrintWriter(filename);
		   
		   
		   System.out.println("Enter your name: ");
		   
		   String name = usrinput.nextLine();
		   
		   System.out.println("Describe yourself: ");
		   
		   String description = usrinput.nextLine();
		  
		   outputfile.println(name);
		   outputfile.println(description);
		   
		   outputfile.close();
		   
		      System.out.println("Data written to the file.");

	   
	   
	   }

}

