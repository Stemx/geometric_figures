package geometricfigures;

import java.util.Scanner;
import java.lang.Math;

public class Circle extends Menu {
	int radius;
	String name;
	
	public Circle(int aRadius, String aName) {
		name = aName;
		radius = aRadius;
	}
	
	//Run scanner
	Scanner newValue = new Scanner(System.in);
	
	//Name methods
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String changeName() {
		System.out.println("Set new name value: ");
		String newNameValue = newValue.nextLine();
		name = newNameValue;
		return name;
	}
	
	//Radius methods
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int changeRadius() {
		System.out.println("Set new radius value: ");
		int newRadiusValue = newValue.nextInt();
		radius = newRadiusValue;
		return radius;
	}
	
	public double getCircleArea() {
		return Math.PI * (radius * radius);
	}
	
	public double getCirclePerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void printValues() {
		System.out.println("/Your Circle values/ Name: " + getName() + ". Radius: " + getRadius() + ". Area: " + getCircleArea() + "Perimeter: " + getCirclePerimeter());
	}

}
