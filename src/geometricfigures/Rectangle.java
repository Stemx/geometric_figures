package geometricfigures;

import java.util.Scanner;

//The Rectangle has four fields
public class Rectangle {
	private String name;
	private double length;
	private double width;
	
	//Rectangle class has one constructor
	public Rectangle (String aName, double aLength, double aWidth) {
		name = aName;
		length = aLength;
		width = aWidth;
	}
	
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
	
	public void changeWidth() {
		System.out.println("Set new width value: ");
		Scanner newValue = new Scanner(System.in);
		int newWidthValue = newValue.nextInt();
		newValue.close();
		}
	
	public void changeLength() {
		System.out.println("Set new length value: ");
		Scanner newValue = new Scanner(System.in);
		int newLengthValue = newValue.nextInt();
		newValue.close();
	}
	
	public void printValues() {
		System.out.println("Rectangle name: " + name + " Length: " + length + " Width: " + width);
	}
}
