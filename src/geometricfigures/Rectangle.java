package geometricfigures;

import java.util.Scanner;

//The Rectangle has four fields
public class Rectangle extends Menu {
	private String name;
	private double length;
	private double width;
	
	//Rectangle class has one constructor
	public Rectangle (String aName, double aLength, double aWidth) {
		name = aName;
		length = aLength;
		width = aWidth;
	}
	
	Scanner newValue = new Scanner(System.in);
	
	//Rectangle class has 6 methods
	public String getName() {
		return name;
	}
	
	public String setName() {
		System.out.println("Set new name: ");
		String newName = newValue.nextLine();
		this.name = newName;
		return name;
	}
	
	public double getLength() {
		return length;
	}
	
	public double setLength() {
		System.out.println("Set new length value: ");
		double newLengthValue = newValue.nextDouble();
		length = newLengthValue;
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double setWidth() {
		System.out.println("Set new width value: ");
		int newWidthValue = newValue.nextInt();
		width = newWidthValue;
		return width;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return (2 * length) + (2 * width);
	}
	
	public void printValues() {
		System.out.println("Rectangle name: " + name + ". Length: " + length + ". Width: " + width + " Area: " + getArea() + " Perimeter: " + getPerimeter());
	}
}
