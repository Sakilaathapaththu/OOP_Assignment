import java.util.Scanner;
public class RoomChargeCalculator{
	
	public void getChargeDeluxDouble()
	{
		Scanner myscanner = new Scanner(System.in);
		boolean balcony, parking, tv, kitchen, wifi;
		
		int total = 0;
		
		System.out.print("\nDo you want Balcony?(500)(true/false): ");
		balcony = myscanner.nextBoolean();
		if(balcony == true) {
			total = total + 500;
			}
		
		System.out.print("Do you want Parking?(200)(true/false): ");
		parking = myscanner.nextBoolean();
		if(parking == true) {
			total = total + 200;
		
		}
		
		System.out.print("Do you want TV?(200)(true/false): ");
		tv = myscanner.nextBoolean();
		if(tv == true) {
			total = total + 200;
		
		}
		
		System.out.print("Do you want Kitchen?(1000)(true/false): ");
		kitchen = myscanner.nextBoolean();
		if(kitchen == true) {
			total = total + 1000;
		
		}
		
		System.out.print("Do you want Wifi?(100)(true/false): ");
		wifi = myscanner.nextBoolean();
		if(wifi == true) {
			total = total + 100;
		}
		
		System.out.println("\nTotal fee = Rs." + (total + 5000));
		
	}

	public void getChargeStandardFamily()
	{
		Scanner myscanner = new Scanner(System.in);
		boolean parking, kitchen, garden;
		
		int total = 0;
		System.out.print("\nDo you want Parking?(200)(true/false): ");
		parking = myscanner.nextBoolean();
		if(parking == true) {
			total = total + 200;
			}
			
		System.out.print("\nDo you want Kitchen?(500)(true/false): ");
		kitchen = myscanner.nextBoolean();
		if(kitchen == true) {
			total = total + 500;
			}
			
		System.out.print("\nDo you want Garden?(200)(true/false): ");
		garden = myscanner.nextBoolean();
		if(garden == true) {
			total = total + 200;
			}
		System.out.println("\nTotal fee = Rs." + (total + 3000));
	
	}
	public void getChargeStandardSingle()
	{
		Scanner myscanner = new Scanner(System.in);
		
		boolean parking, ac, wifi;
		
		int total = 0;
		
		System.out.print("\nDo you want Parking?(200)(true/false): ");
		parking = myscanner.nextBoolean();
		if(parking == true) {
			total = total + 200;
		
		}
		
		System.out.print("Do you want Kitchen?(500)(true/false): ");
		ac = myscanner.nextBoolean();
		if(ac == true) {
			total = total + 500;
		
		}
		
		System.out.print("Do you want Wifi?(100)(true/false): ");
		wifi = myscanner.nextBoolean();
		if(wifi == true) {
			total = total + 100;
		}
		
		System.out.println("\nTotal fee = Rs." + (total + 2000));
		
	
	}
	

}

