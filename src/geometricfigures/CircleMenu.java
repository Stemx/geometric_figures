package geometricfigures;

import java.util.Scanner;

public class CircleMenu extends Circle{

	public CircleMenu(String aName, int aRadius) {
		super(aName, aRadius);
		// TODO Auto-generated constructor stub
	}
	
	//new scanner
			Scanner scanner = new Scanner(System.in);
			
			//One method of CircleMenu
			public void getCircleMenu() {
				
				String[] circleMenu = new String[4];
				
				//Circle menu array with user choice
				circleMenu[0] = "Set circle name. ";
				circleMenu[1] = "Set circle radius. ";
				circleMenu[2] = "Do all stuff. Set name, set radius and print circle area and perimeter.";
				
				//Print user menu
				for (int i = 0; i < 3; i++)
				{
					System.out.println(circleMenu[i] + " Press " + i + ".");
				}
				
				//Question for user
				System.out.println();
				System.out.println("---------------------------------------------");
				System.out.println();
				System.out.println("What do you want to do? Press from 0 to 2.");
				
				//User input
				int choice = scanner.nextInt();
				
				Circle circle = new Circle(" ", 0);
				
				//Switch choice
				switch (choice)
				{
				case 0:
					circle.changeName();
					break;
				case 1:
					circle.changeRadius();
					System.out.println("Circle area: " + circle.getCircleArea() + ". Circle perimeter: " + circle.getCirclePerimeter() + ".");
					break;
				case 2:
					circle.changeName();
					circle.changeRadius();
					circle.printValues();
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
				
				//Filling array to the end
				String[] circleMenu1 = new String[8];
				
				circleMenu1[0] = "Set circle name.";
				circleMenu1[1] = "Set circle radius.";
				circleMenu1[2] = "Print recent values";
				circleMenu1[3] = "Save data to the .txt file.";
				circleMenu1[4] = "Return to the main menu.";
				circleMenu1[5] = "Exit.";

					
					for (int i = 0; i < 6; i++)
					{
						System.out.println(circleMenu1[i] + " Please press " + i + ".");
					}
					
					int choice1 = scanner.nextInt();
					
					switch (choice1)
					{
						case 0:
							circle.changeName();
							break;
						case 1:
							circle.changeRadius();
							break;
						case 2:
							circle.printValues();
							break;
						case 3:
							System.out.println("This feature is not available yet. Sorry :(");
							break;
						case 4:
							System.out.println("Now you are in main menu.");
							Menu menu = new Menu();
							menu.getGeometricFiguresMenu();
							break;
						case 5:
							System.out.println("See you next time!");
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

}
