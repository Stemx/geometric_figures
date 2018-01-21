package geometricfigures;

import java.util.Scanner;

//Using this class you reveal program menu
public class Menu extends GeometricFigures {
	
	//empty constructor
	public Menu() {
		
	}
	
	//Create new Scanner object
	Scanner scanner = new Scanner(System.in);
	
	//Print menu method
	public void getGeometricFiguresMenu() {
		System.out.println("Welcome to a GeometricFigures program.");
		System.out.println("--------------------------------------");
		System.out.println("Do you want to see a program menu? (yes / no)");
		
		//User puts answer in scanner object
		String answer = scanner.nextLine();
		
		//User question. User have 4 options. Each option (except "Exit program") have their own menu class
		//If answer is positive - print the options
		if (answer.equals("yes") || answer.equals("Yes") || answer.equals("YES"))
		{
			
			//Putting menu into array
			System.out.println("GeometricFigures menu: ");
			String[] menu = new String[4];
			menu[0] = "Rectangle";
			menu[1] = "Triangle";
			menu[2] = "Circle";
			menu[3] = "Exit program";
			
			//Printing menu
			for(int i = 0; i < 4; i++)
			{
				System.out.println((i+1) + ". " + menu[i]);
			}
			
			//Explicit message to user
			System.out.println("Select the geometric figure: '1', '2', '3', or exit the program. ");
			
			//User choice for exact figure menu
			int choice = scanner.nextInt();
			
			//Switch menu
			switch (choice) {
			case 1:
				{
				System.out.println("You choose Rectangle menu: ");// + Rectangle Menu
				System.out.println("---------------------------");
				RectangleMenu recMenu = new RectangleMenu("", 0, 0);
				recMenu.getRectangleMenu();
				break;
				}
			case 2:
				{
				System.out.println("You choose Triangle menu: "); // + Triangle Menu
				System.out.println("--------------------------");
				TriangleMenu triMenu = new TriangleMenu("", 0, 0);
				triMenu.getTriangleMenu();
				break;
				}
			case 3:
				{
				System.out.println("You choose Circle menu: "); // + Circle Menu
				System.out.println("------------------------");
				CircleMenu cirMenu = new CircleMenu("", 0);
				cirMenu.getCircleMenu();
				break;
				}
			case 4:
				{
				System.out.println("You choose Exit.");
				System.out.println("----------------");
				System.out.println();
				break;
				}
			default:
				{
				System.out.println("Wrong answer!");
				System.out.println("-------------");
				break;
				}
			
			}
			
		}
		
		//If answer is negative then...
		else
		{
			System.out.println("Closing program.");
		}
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Thank you for using my program. Mateusz Stempak.");
		System.out.println("------------------------------------------------");
		
	}
	
	
	
	//Unit test
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.getGeometricFiguresMenu();
	}
}
