package restaurantproject;
import java.util.Scanner;
 
public class main {
	public static Scanner input =new Scanner(System.in);
	public static int choice,Quantity=1;
	public static String again;
	public static double total=0,pay;
	public static void menu() {
		System.out.println("'_'_'_'_'_'_'_'_'_'_'_'_'_'_'_");
		System.out.println("\\WELCOME TO OUR RESTAURANT");
		System.out.println("Restaurant Menu");
		System.out.println("\t1.Barger Rupees $80.00");
		System.out.println("\t2.Pizza Rupees $100.00");
		System.out.println("\t3.Coffee Rupees $60.00");
		System.out.println("\t4.Cancel    ");
		
	
		
	}
	public static void order() {
		System.out.println("1 to Barger | 2 to Pizza |3 to Coffee ");
		System.out.println("press you want to order");
		choice=input.nextInt();
		if(choice==1) {
			System.out.println("Your choice is Barger");
			System.out.println("How many Bargers want to Order:");
			Quantity=input.nextInt();
			total=total+(Quantity*80);
			System.out.println("amount="+total);
			System.out.println("You want to order again");
			System.out.println("Press Y for [Yes] and N for [No]");
			again=input.next();
			if( again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("enter payment:");
				pay=input.nextDouble();
				if(pay<total)
					System.out.println("No,Need More");
				else {
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("customer's return "+total+ " tk");
				}
			}
		}
		if(choice==2) {
			System.out.println("Your choice is Pizza");
			System.out.println("How many pizza want to Order:");
			Quantity=input.nextInt();
			total=total+(Quantity*100);
			System.out.println("amount="+total);
			System.out.println("You want to order again");
			System.out.println("Press Y for [Yes] and N for [No]");
			again=input.next();
			if( again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("enter payment:");
				pay=input.nextDouble();
				if(pay<total)
					System.out.println("No,Need More");
				else {
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("customer's return "+total+ "tk");
				}
			}
		}
		if(choice==3) {
			System.out.println("Your choice is coffee");
			System.out.println("How many coffee want to Order:");
			Quantity=input.nextInt();
			total=total+(Quantity*60);
			System.out.println("amount="+total);
			System.out.println("You want to order again");
			System.out.println("Press Y for [Yes] and N for [No]");
			again=input.next();
			if( again.equalsIgnoreCase("Y"))
				order();
			else {
				System.out.println("enter payment:");
				pay=input.nextDouble();
				if(pay<total)
					System.out.println("No,Need More");
				else {
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("customer's return "+total+ " tk");
					System.out.println("---------------------------------");
					System.out.println("---------------------------------");
				}
			}
		}
		else if(choice==4 ) {
			System.out.println("thank u visit again");
			System.exit(0);

		}
		else {
			System.out.println("Choose a food in this items : ");
			order();
		}
	}
	public static void main(String[] args) {
		menu();
		order();
		
		

	}

}
