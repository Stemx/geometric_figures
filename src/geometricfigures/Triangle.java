package geometricfigures;

import java.util.Scanner;

public class Triangle extends Menu{
	private String name;
	private double height;
	private double base;
	
	public Triangle(String aName, double aHeight, double aBase) {
		setName(aName);
		setHeight(aHeight);
		setBase(aBase);
	}
	
	//New Scanner object
	Scanner newValue = new Scanner(System.in);

	//Class Triangle have 11 methods
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double changeHeight() {
		System.out.println("Set new height value: ");
		double newHeightValue = newValue.nextDouble();
		height = newHeightValue;
		return height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double changeBase() {
		System.out.println("Set new base value: ");
		double newBaseValue = newValue.nextDouble();
		base = newBaseValue;
		return base;
	}
	
	public double getTriangleArea() {
		return (base * height) / 2;
	}
	
	public void printValues() {
		System.out.println("/Actual triangle values/  Name: " + getName() + ". Height: " + getHeight() + ". Base: " + getBase() + ". Area: " + getTriangleArea());
	}
	
	//Unit test
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Base and Height");
		String n = sc.nextLine();
		int b = sc.nextInt();
		int h = sc.nextInt();
		Triangle t = new Triangle(n, h, b);
		System.out.println(t.getTriangleArea());
		sc.close();
	}
}
