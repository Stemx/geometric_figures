package geometricfigures;

import java.util.Scanner;

public class GeometricFigures {

	public static void main(String[] args) {
		
		//Nowa tablica klas
		//pole 
		Rectangle[] rec = new Rectangle[4];
		rec[0] = new Rectangle ("Mikro prostokąt", 1.5, 0.4);
		rec[1] = new Rectangle ("Mały prostokąt", 4.5, 3.4);
		rec[2] = new Rectangle ("Średni prostokąt", 9.456, 5.67);
		rec[3] = new Rectangle ("Duży prostokąt", 15.55, 10.0);
		
		for (Rectangle r: rec)
		{
			r.printValues();
			System.out.println("Square: " + r.getSquare());
			System.out.println("Perimeter: " + r.getPerimeter());
			System.out.println("**************************");
		}
		
		rec[0].changeLength();
		rec[0].changeWidth();
		
		rec[0].printValues();
		
		/*
		System.out.println(rec[0].getName());
		System.out.println(rec[1].getName());
		
		System.out.println(rec[0].getSquare());
		System.out.println(rec[1].getSquare());
		
		System.out.println(rec[0].getPerimeter());
		System.out.println(rec[1].getPerimeter());
		*/
		
		
	}

}
