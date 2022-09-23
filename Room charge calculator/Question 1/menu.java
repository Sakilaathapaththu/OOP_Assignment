import java.util.Scanner;
public class menu {
	
	 public void displayMainMenu() {
		Scanner x=new Scanner(System.in);
		RoomChargeCalculator dd=new RoomChargeCalculator();
		System.out.println("==========================\n\tRoom Types\t\t\t\n==========================");
		System.out.println("1. Delux-Double\n2. Standard-Family\n3. Standard-Single\n4. Quit");
		System.out.print("Enter your choice(1-4) : ");
		
		int select=x.nextInt();
		
		if(select==1)
		{
			System.out.println("\nDeluxDouble Room\nFixed fee = 5000\n" + "Additional chargers,");
			dd.getChargeDeluxDouble();
			displayMainMenu();
		}
		else if(select==2)
		{
			System.out.println("\nStandardFamily Room\nFixed fee = 3000\n" + "Additional chargers,");
			dd.getChargeStandardFamily();
			displayMainMenu();
		}
		else if(select==3)
		{
			System.out.println("\nStandardSingle Room\nFixed fee = 2000\n" + "Additional chargers,");
			dd.getChargeStandardSingle();
			displayMainMenu();
		}
		else if(select==4)
		{
			return;
		}
		else 
		{
			System.out.println("number outsid the range..!");
			displayMainMenu();
		}
				
		
		
		
		
	}
}

