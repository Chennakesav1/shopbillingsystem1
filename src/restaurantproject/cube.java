package restaurantproject;
import java.util.Scanner;

public class cube {

	public static void main(String[] args) {
		int number,cube;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number to find cube of a number");
		number=input.nextInt();
		cube=number*number*number;
		System.out.println("cube of a number is :"+cube);
		}

}
