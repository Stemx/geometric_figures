package geometricfigures;

import java.util.Scanner;

public class TriangleMenu extends Triangle {

	public TriangleMenu(String aName, double aHeight, double aBase) {
		super(aName, aHeight, aBase);
		
	}
	
	//new scanner
		Scanner scanner = new Scanner(System.in);
		
		//One method of Rectangle Menu
		public void getTriangleMenu() {
			
			String[] triangleMenu = new String[4];
			
			//Rectangle menu array with user choice
			triangleMenu[0] = "Set triangle name.";
			triangleMenu[1] = "Set triangle base, height and get area.";
			triangleMenu[2] = "Do all stuff and print values.";
			
			//Print user menu
			for (int i = 0; i < 3; i++)
			{
				System.out.println(triangleMenu[i] + " Press " + i + ".");
			}
			
			//Question for user
			System.out.println();
			System.out.println("---------------------------------------------");
			System.out.println("What do you want to do? Press from 0 to 2.");
			
			//User input
			int choice = scanner.nextInt();
			
			Triangle triangle = new Triangle(" ", 0, 0);
			
			//Switch choice
			switch (choice)
			{
			case 0:
				triangle.changeName();
				break;
			case 1:
				triangle.changeBase();
				triangle.changeHeight();
				System.out.println("Triangle area: " + triangle.getTriangleArea());
				break;
			case 2:
				triangle.changeName();
				triangle.changeBase();
				triangle.changeHeight();
				triangle.printValues();
				break;
			default:
				System.out.println("Something came wrong!");
				break;
			}
			
			System.out.println("Do you want to continue? (1 for YES / 0 for NO)");
					
			int userAnswer = scanner.nextInt();
			
			while (userAnswer == 1)
			{
			
			//Next steps: save data to the file or just exit program
			System.out.println();
			System.out.println("What do you want to do next?");
			System.out.println("----------------------------");
			System.out.println();
			
			//Filling array to the end
			String[] triangleMenu1 = new String[7];
			
			triangleMenu1[0] = "Set name for a new triangle.";
			triangleMenu1[1] = "Set base, height and get an area of triangle.";
			triangleMenu1[2] = "Do all stuff and print values.";
			triangleMenu1[3] = "Save data to the .txt file.";
			triangleMenu1[4] = "Return to the main menu.";
			triangleMenu1[5] = "Exit.";

				
				for (int i = 0; i < 6; i++)
				{
					System.out.println(triangleMenu1[i] + " Please press " + i + ".");
				}
				
				int choice1 = scanner.nextInt();
				
				Triangle triangle1 = new Triangle("", 0, 0);
				triangle1 = triangle;
				
				switch (choice1)
				{
					case 0:
						triangle1.changeName();
						break;
					case 1:
						triangle1.changeBase();
						triangle1.changeHeight();
						System.out.println("Triangle area: " + triangle1.getTriangleArea());
						break;
					case 2:
						triangle1.changeName();
						triangle1.changeBase();
						triangle1.changeHeight();
						triangle1.printValues();
						break;
					case 3:
						System.out.println("Sorry. Not available yet.");
						break;
					case 4:
						System.out.println("Now you are in main menu.");
						Menu menu = new Menu();
						menu.getGeometricFiguresMenu();
						break;
					case 5:
						System.out.println("See you next time");
						break;
					default:
						System.out.println("Something gone wrong.");
						break;
					
				}
				
				if (choice1 == 5)
				{
					break;
				}
			}
		}
		
		public static void main(String[] args) {
			TriangleMenu tMenu = new TriangleMenu("", 0, 0);
			tMenu.getTriangleMenu();
		}
}
