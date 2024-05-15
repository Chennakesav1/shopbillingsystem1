package restaurantproject;
import java.util.Scanner;

public class addition {
	public static String again;
	public static void list() {
		int a,b,c;
		String ch;
		Scanner input= new Scanner(System.in);
		System.out.println("enter the first value a=");
		a=input.nextInt();
		System.out.println("enter the second value b=");
		b=input.nextInt();
		System.out.println("enetr the character + - / * %");
		ch=input.next();
		switch(ch){
		case "+" :
			System.out.println("addition of two numbers is");
			c=a+b;
			System.out.println("c="+c);
		    break;
		case "-" :
			System.out.println("subtraction of two numbers is");
			c=a-b;
			System.out.println("c="+c);
		    break;
		case "*" :
			System.out.println("Multiplication of two numbers is");
			c=a*b;
			System.out.println("c="+c);
		    break;
		case "%" :
				System.out.println("modules of two numbers is");
				c=a%b;
				System.out.println("c="+c);
			    break;
	    default:
	    	System.out.println("enter the valid expression");
	    	break;
	    	
		
		}
		System.out.println("Press Y for [Yes] and N for [No]");
		again=input.next();
		if( again.equalsIgnoreCase("Y")) 
			list();
			else {
				System.out.println("thanking you for Using me");
			}
		}
	public static void main(String[] args) {
		list();
		
	}
	

}
