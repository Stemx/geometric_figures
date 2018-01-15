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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String changeName() {
		System.out.println("Set new name: ");
		String newName = newValue.nextLine();
		this.name = newName;
		return name;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double changleLength() {
		System.out.println("Set new length value: ");
		double newLengthValue = newValue.nextDouble();
		length = newLengthValue;
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double changeWidth() {
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
