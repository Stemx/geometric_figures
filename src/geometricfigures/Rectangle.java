package geometricfigures;

import java.util.Scanner;

//The Rectangle has four fields
public class Rectangle {
	private String name;
	private int length;
	private int width;
	
	//Rectangle class has one constructor
	public Rectangle (String aName, int aLength, int aWidth) {
		name = aName;
		length = aLength;
		width = aWidth;
	}
	
	Scanner newValue = new Scanner(System.in);
	
	//Rectangle class has 6 methods
	public String getName() {
		return name;
	}
	
	public double getSquare() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (2 * length) + (2 * width);
	}
	
	public int changeWidth() {
		System.out.println("Set new width value: ");
		int newWidthValue = newValue.nextInt();
		width = newWidthValue;
		return width;
	}
	
	public int changeLength() {
		System.out.println("Set new length value: ");
		int newLengthValue = newValue.nextInt();
		length = newLengthValue;
		return length;
	}
	
	public void printValues() {
		System.out.println("Rectangle name: " + name + " Length: " + length + " Width: " + width);
	}
}
