package Programming;

import java.util.Scanner;

public class Event_Driven {

	public static void main(String[] args) {
	Scanner inputChoice=new Scanner(System.in);
	System.out.println("Enter your choice:");
	int Choice=inputChoice.nextInt();
	 if (Choice==1) {
	
		 menu();
		 extraa();
		
		
	 }
	 switch(Choice)
	 {
 case 2:
	 System.out.println("The Dessert Menu");
	 System.out.println("1. Cupcake"+ ""+ "  Price " +" 2-6Jd");
	 System.out.println("1. Tiramisu"+ "" + "  Price " +" 4 Jd");
	 System.out.println("1.pancake"+ "  Price " +"" + " 3 Jd");
	 
	 break;
	 
 case 3:
	 System.out.println("The Drinks Menu");
	 System.out.println("Coffee latte");
	 System.out.println("Orange juice");
	 System.out.println("Mocha coffee");
	
 break;
 case 4: 
	 System.out.println("Return back to the main menu");
	 menu();
	 extraa();
	 break;
	 }


	}
	
	static void menu(){
		 System.out.println(" The Main Meal Menu ");
		System.out.println("1. Steak lamb " + "  price: " + "15 Jd" );
		System.out.println("1. Shawerma " + "  price: " + "3.50 Jd" );
		System.out.println("1. pasta " + "  price: " + "7 Jd" );
	}
	static void extraa()
	{
		Scanner extra=new Scanner (System.in);
		System.out.println("enter your extra order1:");
		int choice2=extra.nextInt();
	
		
			if(choice2==1) {
				System.out.print("Salad :");
		System.out.println(" There is only Fattoush aviable");
			}
		else if(choice2==2)
		{
		
			System.out.print("potato :");
		System.out.println(" There is French fries");
		}
		else {
			System.out.println("please give me the total account");
		}
	}
}
			


