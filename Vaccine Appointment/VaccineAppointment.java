//Amar Mahmoud
//Start of program
import java.util.Scanner;

public class VaccineAppointment {

	public static void main(String[] args) {
		System.out.println("-------****-------****-------****-------****-------");
		System.out.println("            Welcome to Vaccine Program!            ");//printing welcome message
		System.out.println("-------****-------****-------****-------****-------");
		
		System.out.println("Here are some vaccine you could choose:");
		System.out.println("        1 - Pfizer");
		System.out.println("        2 - Moderna");
		System.out.println("        3 - AstraZeneca");
		System.out.println("        4 - Johnson&Johnson");
		System.out.println("        5 - Sinovac");
		System.out.println("        6 - Gamaleya");
		System.out.println("        7 - Quit");
		
		
		//initializing variables
		int input,place,time;
		String vaccine = null;
		String location = null;
		String clock=null;
		//creating new scanner.
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("\nPlease enter the digit corresponding to your option: ");
		input = scanner.nextInt();//making input = the integer entered
	    	
			//while the input is greater than 7 or less than 1, prompt an error.
			while(input>7||input<1) {
	    	System.out.println("Invalid choice!!! Try again: ");
			//prompt another input from the user until the input is between 1 and 7
	    	input=scanner.nextInt();}
	    	
		//creating switch statement
		switch (input)
		{
			//if case 1 is true then assign vaccine to "Pfizer(m-RNA, 2 doses)"
		    case 1 : 
		    vaccine="Pfizer(m-RNA, 2 doses)";
		    System.out.println("Here is the location for the vaccine you chose:");

		    System.out.print("        1 - Pharmaprix        "); 
		    System.out.println("\n        2 - Vaccination Center        ");
		    
		    break; 
		    case 2 :
		    	System.out.println("Here is the location for the vaccine you chose:");

			//if case 2 is true then assign vaccine to "Moderna(m-RNA, 2 doses)"
		    vaccine="Moderna(m-RNA, 2 doses)";	
		    System.out.print("        1 - Pharmaprix            "); 
		    System.out.println("\n        2 - Vaccination Center    ");
		    
		    break; 
		    case 3 : 
		    	System.out.println("Here is the location for the vaccine you chose:");

			//if case 3 is true then assign vaccine to "AstraZeneca(Viral vector, 2 doses)"
		    vaccine="AstraZeneca(Viral vector, 2 doses)";	 
		    System.out.print("        3 - PJC Jean Coutu     "); 
		    System.out.println("\n        5 - Uniprix Clinique    ");
		    break; 
		    
		    case 4 : 
		    	System.out.println("Here is the location for the vaccine you chose:");
			//if case 4 is true then assign vaccine to "Johnson&Johnson(Viral vector, 1 dose)"	
		    vaccine="Johnson&Johnson(Viral vector, 1 dose)";
		    System.out.print("        4 - Health Center"); 
		    break; 
		    
		    case 5 :
		    	
		    vaccine="Sinovac";		
		    System.out.print("\nSorry the vaccine Sinovac is not avaliable."); 
		    System.out.print("\n\nHope you can take the vaccine very soon! Take care!"); //display this message then break
		    break; 
		    
		    case 6 :
		    	
		    vaccine="Gamaleya";		
		    System.out.print("\nSorry the vaccine Gamaleya is not avaliable."); 
		    System.out.print("\n\nHope you can take the vaccine very soon! Take care!"); 
		    break;
		    
		    case 7 : 
		    System.out.println("");
		    break;
		    
		} 
		    if(input == 7) //if input= 7
		    {
		    	System.out.println("Thank you for using this program !! ");
		    	System.exit(1);//exit 
		    }		    
		    
		    if(input==5||input==6)//if the user picks from one of the two non avaliable vaccines we exit after displaying a message
		    {
		    	System.out.println("\n\nThank you for using this program !! ");
		   System.exit(1);
		    {}	
		    }	
		    
		    System.out.println("\nPlease enter the digit corresponding to your option: ");
		    place=scanner.nextInt();//setting place=the next user input
		    
		    while(place<1||place>4) { //so long as the value of place is <1 or >4 prompt the user to re-enter a value.
		    	System.out.println("Invalid choice!!! Try again: ");
		    	place=scanner.nextInt();}
		    
		    switch(place) {//creating switch 
		    case 1: 
		    location="Pharmaprix";//if case 1 is true then assign location to"Pharmaprix" 
		    break;
		    case 2:
		    location="Vaccination Center";//if case 2 is true then assign location to"Vaccination Center"
		    break;
		    case 3:
		    location= "PJC Jean Coutu";//if case 3 is true then assign location to"PJC Jean Coutu"
		    break;
		    case 4:
		    location ="Health Center";//if case 4 is true then assign location to"Health Center" 
		    break;
		    case 5: 
		    location = "Uniprix Clinique";//if case 5 is true then assign location to"Uniprix Clinique"
		    }

		    if(place >5 || place<1 ) //if the value of place <1 or >5 then re-prompt the user to input
		    {
		    	System.out.println("Invalid choice!!! Try again: ");
		    	input=scanner.nextInt();
		    }
		    
		    System.out.println("Here are some time slots you could choose: ");
		    System.out.println("      1 - 2:00 - 2:15");
		    System.out.println("      2 - 2:20 - 2:35");
		    System.out.println("      3 - 2:40 - 2:55");
		    System.out.println("      4 - 3:00 - 3:15");
		    System.out.println("      5 - Quit");
		    System.out.println("Please enter the digit corresponding to your option: ");
		    time = scanner.nextInt(); //set time = the next user input
		   
		    switch(time) {//creating switch 
		    case 1: 
		    clock="2:00 - 2:15";//assigning timings to the string clock depending on the case that executes.
		    break;
		    case 2:
		    clock="2:20 - 2:35";
		    break;
		    case 3:
		    clock= "2:40 - 2:55";
		    break;
		    case 4:
		    clock ="3:00 - 3:15";
		    break;
		    }
		    
		    if(time == 5)//if time value is 5 then exit the program and display the exit message.
		    {
		    	System.out.println("Thank you for using this program !! ");
		    	System.exit(1);
		    }		    
		
		    
		    System.out.println("");
		    System.out.println("The booked vaccine is: " + vaccine+".");//displays information
		    System.out.println("Your schedule is: "+clock + " @ "+ location+".");
		    
		    
		    System.out.println("\nThank you for using this program!!");//exit message
		
		
			scanner.close();  //closing the scanner
}}
