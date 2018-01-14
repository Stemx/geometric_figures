package geometricfigures;

import java.util.Scanner;

public class GeometricFigures {

	public static void main(String[] args) {
		
		//New scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many rectangles do you want to have?");
		int recNumber = scanner.nextInt();
		
		//New Rectangle array
		Rectangle[] rec = new Rectangle[recNumber];
		
		System.out.println("Array length: " + rec.length);
		
		for (int i = 0; i < rec.length; i++)
		{
			rec[i] = new Rectangle("Unnamed", 0, 0);
		}
		
		for (Rectangle r : rec)
		{
			r.printValues();
		}
		
		System.out.println("You have to fill some informations about your rectangles: ");
		
		for (Rectangle r : rec)
		{
			r.changeName();
			r.changeLength();
			r.changeWidth();
		}
		
		for (Rectangle r : rec)
		{
			r.printValues();
			System.out.println("***");
		}
		
		scanner.close();
		
	}

}
