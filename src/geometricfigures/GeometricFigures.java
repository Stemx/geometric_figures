package geometricfigures;

import java.util.Scanner;

public class GeometricFigures {

	public static void main(String[] args) {
		
		//New array of Rectangle class fields
		//An array contains 4 index
		Rectangle[] rec = new Rectangle[4];
		rec[0] = new Rectangle ("Extra small rectangle", 2, 1);
		rec[1] = new Rectangle ("Small rectangle", 5, 3);
		rec[2] = new Rectangle ("Medium rectangle", 10, 5);
		rec[3] = new Rectangle ("Large rectangle", 19, 11);
		
		//Print values, squares and perimeter of rectangles
		for (Rectangle r: rec)
		{
			r.printValues();
			System.out.println("Square: " + r.getSquare());
			System.out.println("Perimeter: " + r.getPerimeter());
			System.out.println("**************************");
		}
		
		//Change rectangle width and length
		for (Rectangle r: rec)
		{
			System.out.println(r.getName());
			r.changeLength();
			r.changeWidth();
		}
		
		for (Rectangle r: rec)
		{
			r.printValues();
		}
		
	}

}
