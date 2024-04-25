/**
 * Programming Challenge 4: LandTract Class
 * The LandTract class stores information
 * about a tract of land.
 */

public class LandTract
{
	public double length;
	public double width;



public LandTract(double length, double width) {
	this.length = length;
	this.width = width;
	
	
}
public double getArea() {
	return length*width;
}

public boolean equals(LandTract tract2) {
	return this.length == tract2.length && this.width == tract2.width;
}

public String toString() {
	return "Length= " +length+ " \nWidth= "+ width + "\nArea = "+length*width+ "";
}
}