import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * This class allows you to convert a csv file to arff file.
 * @author MJ
 *
 */
public class Csv2Arff {
	private String csvFileLocation;
	
	/**
	 * Keep as is. 
	 * Constructor.
	 * @param Location: The name 
	 */
	public Csv2Arff(String strFileLocation)
	{
		csvFileLocation=strFileLocation;
	}
	
	/**
	 * You need to code this
	 * This method accepts a name of a csv file and it writes an arff file from the csv file
	 * Writing arff file is similar to writing any .txt file. Just make sure the arff file name ends with .arff
	 * @param theLocation: The name and location of any csv file
	 */
	public void Convert2Arff(String theLocation)
	{
		 try {
	            //Converts the file extension from .csv to .arff
	            String arffFileName = theLocation.replace(".csv", ".arff");

	            
	            BufferedReader csvReader = new BufferedReader(new FileReader(theLocation));
	            
	            BufferedWriter arffWriter = new BufferedWriter(new FileWriter(arffFileName));

	            //writes the header alongside getting the file location to display as the file title
	            arffWriter.write("@relation " + theLocation.substring(theLocation.lastIndexOf('/') + 1, theLocation.lastIndexOf('.')) + "\n\n");
	        	


	            //defines the headers and attributes to be displayed alongside with the setting the values to attributes like numeric
	            String headerLine = csvReader.readLine();
	            String[] attributes = headerLine.split(",");
	            for (String attribute : attributes) {
	                if(attribute.equals("File")) {
	                	 arffWriter.write("@attribute " + attribute + " Text\n");
	                }else {
	                	
	                	arffWriter.write("@attribute " + attribute + " numeric\n");	
	                
	                }
	            }
	            arffWriter.write("@attribute Ref { TRUE, FALSE }\n");
	            arffWriter.write("@attribute PRE_BUG { TRUE, FALSE }\n");
	            arffWriter.write("@attribute BUG_FIX { TRUE, FALSE }\n");
	            
	            
	            //displays the @data header
	            arffWriter.write("\n@data\n\n");

	            //defines values for the .javas and numerical data
	            StringBuilder javaFiles = new StringBuilder();
	            String row;
	            
	            while ((row = csvReader.readLine()) != null) {
	                // 
	                String[] values = row.split(",");
	                
	                javaFiles.append(values[0]).append(",");
	                
	                //code responsible for writing the numeric data
	                
	                for (int i = 1; i < values.length; i++) {
	                   
	                	arffWriter.write(values[i]);
	                    
	                	if (i < values.length - 1) {
	                        
	                    	arffWriter.write(",");
	                    }
	                
	                }
	               
	                arffWriter.write("\n");
	            }
	            //code responsible for writing the .java single line
	           
	            arffWriter.write(javaFiles.deleteCharAt(javaFiles.length() - 1).toString() + "\n");

	            
	            csvReader.close();
	            arffWriter.close();

	            
	        } catch (IOException e) {
	        }
	    
	
		System.out.println("Done =)");
			
	}
	
	/**
	 * You need to code this
	 * This method should read the text file given in theFile, and store it into a two dimensional array of Strings.
	 * This method should return the data given in a specific row and column in the two dimensional array
	 * @param theFile: name of the csv file to open 
	 * @param row: row number in the two dimensional array
	 * @param column: column number in the two dimensional array
	 * @return strData2Return: the data in the [row][column]
	 */
	public String RetrieveCell(String theFile, int row, int column)
	{
		String strData2Return="";
		try (BufferedReader csvReader = new BufferedReader(new FileReader(theFile))) {
	        
	        csvReader.readLine();

	        //Iterates through the lines until it finds the user inputted column and row
	        String line;
	        for (int i = 0; i < row; i++) {
	            line = csvReader.readLine();
	            
	        }

	        
	        String[] values = csvReader.readLine().split(",");

	      
	        if (column >= 0 && column < values.length) {
	            strData2Return = values[column];
	        }
	    } catch (IOException e) {
	        
	    }

	    return strData2Return;
	}
}