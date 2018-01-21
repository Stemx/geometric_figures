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
	
	//New Scanner object
	Scanner newValue = new Scanner(System.in);
	
	//Rectangle class have 12 methods
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
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int changeLength() {
		System.out.println("Set new length value: ");
		int newLengthValue = newValue.nextInt();
		length = newLengthValue;
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int changeWidth() {
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
