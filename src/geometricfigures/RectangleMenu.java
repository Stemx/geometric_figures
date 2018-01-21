package geometricfigures;

import java.util.Scanner;

public class RectangleMenu extends Rectangle {
	
	
	public RectangleMenu(String aName, int aLength, int aWidth) {
		super(aName, aLength, aWidth);
	}
	
	//New Scanner object
	Scanner scanner = new Scanner(System.in);
	
	//One method of Rectangle Menu
	public void getRectangleMenu() {
		
		//Putting menu choice into array
		String[] rectangleMenu = new String[4];
		
		rectangleMenu[0] = "Set rectangle name.";
		rectangleMenu[1] = "Set rectangle length and width and get rectangle area.";
		rectangleMenu[2] = "Set rectangle length and width and get rectangle perimeter.";
		rectangleMenu[3] = "Do all stuff and print values.";
		
		//Print user menu
		for (int i = 0; i < 4; i++)
		{
			System.out.println(rectangleMenu[i] + " Press " + i + ".");
		}
		
		//Question for user
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("What do you want to do? Press from 0 to 3.");
		
		//User choice
		int choice = scanner.nextInt();
		
		//New Rectangle object
		Rectangle rectangle = new Rectangle(" ", 0, 0);
		
		//Switch choice
		switch (choice)
		{
		case 0:
			rectangle.changeName();
			break;
		case 1:
			rectangle.changeLength();
			rectangle.changeWidth();
			System.out.println("Rectangle area: " + rectangle.getArea());
			break;
		case 2: 
			rectangle.changeLength();
			rectangle.changeWidth();
			System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
			break;
		case 3:
			rectangle.changeName();
			rectangle.changeLength();
			rectangle.changeWidth();
			System.out.println("-----------------------------------");
			System.out.println();
			rectangle.printValues();
			break;
		default:
			System.out.println("Something gone in wrong direction!");
			break;
		}
		
		//Question for user
		System.out.println("Do you want to continue? (1 for YES / 0 for NO)");
				
		int userAnswer = scanner.nextInt();
		
		//Putting user answer into loop
		while (userAnswer == 1)
		{
		
		//Next steps for user
		System.out.println();
		System.out.println("What do you want to do next?");
		System.out.println("----------------------------");
		System.out.println();
		
		//Filling menu array
		String[] rectangleMenu1 = new String[9];
		
		rectangleMenu1[0] = "Set new rectangle name";
		rectangleMenu1[1] = "Set rectangle length and width and get rectangle area.";
		rectangleMenu1[2] = "Set rectangle length and width and get rectangle perimeter.";
		rectangleMenu1[3] = "Just print damn recent values.";
		rectangleMenu1[4] = "Do all stuff and print values.";
		rectangleMenu1[5] = "Save data to the .txt file.";
		rectangleMenu1[6] = "Return to the main menu.";
		rectangleMenu1[7] = "Exit.";

			
			//Printing augumented Rectangle Menu
			for (int i = 0; i < 8; i++)
			{
				System.out.println(rectangleMenu1[i] + " Please press " + i + ".");
			}
			
			//User choice
			int choice1 = scanner.nextInt();
			
			//Switch choice
			switch (choice1)
			{
				case 0:
					rectangle.changeName();
					break;
				case 1:
					rectangle.changeLength();
					rectangle.changeWidth();
					System.out.println("Rectangle area: " + rectangle.getArea());
					break;
				case 2:
					rectangle.changeLength();
					rectangle.changeWidth();
					System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
					break;
				case 3:
					rectangle.printValues();
					break;
				case 4:
					rectangle.changeName();
					rectangle.changeLength();
					rectangle.changeWidth();
					System.out.println("-----------------------------------");
					rectangle.printValues();
					System.out.println();
					break;
				case 5:
					System.out.println("Sorry. Not available yet.");
					break;
				case 6:
					System.out.println("Now you are in main menu.");
					Menu menu = new Menu();
					menu.getGeometricFiguresMenu();
					break;
				case 7:
					System.out.println("See you next time");
					break;
				default:
					System.out.println("Something gone wrong.");
					break;
				
			}
			
			//if user want to exit the loop is break
			if (choice1 == 7)
			{
				break;
			}
		
		}
		
	}
	
}
