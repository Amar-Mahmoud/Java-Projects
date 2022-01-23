//Amar Mahmoud
//Start of program
import java.util.Scanner;

public class ShoppingCalculator {

	public static void main(String[] args) {
		System.out.println("-------****-------****-------****-------****-------");
		System.out.println("      Welcome to Item Shopping Program!            ");//program header
		System.out.println("-------****-------****-------****-------****-------");
		
		Scanner scanner = new Scanner(System.in); //new scanner object
		int items; //creating integers and Strings
		int[] number;
		int[] price;
		String[] name;
		
		System.out.print("Please enter the type number of items:");
		items = scanner.nextInt(); //next integer inputted becomes the value of items
		System.out.println();
	
		 if(items == 0) { //creating the response if the input is 0
			System.out.println("You have 0 items now!");
		 } else{{ //if the input isn't 0 then proceed
			
			 number = new int[items]; //creating arrays
			price = new int[items];
			name = new String[items];
		
			for(int i = 0; i < items; ++i){ //prompting the user to input the item name number and price how many times the items inputted are
				
				System.out.print("Please enter Item " + (i+1) + " name number price:"); 
				name[i] = scanner.next();
				number[i] = scanner.nextInt();
				price[i] = scanner.nextInt();
				
			}
			int amount=0; 
			int pricetotal=0;
			System.out.println("\nHere is your complete shopping list:");
			System.out.println();
			for(int i = 0; i < items; ++i){ //repeat until it reaches the amount of items inputted at the beginning
				
				System.out.println("\n  Item "+i+": " + number[i]+" "+name[i]+ " , "+"price$ "+price[i]*number[i]);
			pricetotal+=price[i]*number[i]; //creating a new variable to hold the price total
			amount+=number[i];
			}
			System.out.println("\nYou have "+amount+" items in total. "+"The total price is: " +"$"+pricetotal+".");} //displays the amount of items in total and the total price
			
		}
		 System.out.println();
		 System.out.println("\nThank you for using this program!!");//closing message

		 scanner.close();  //closing the scanner
	}
}
//end of program