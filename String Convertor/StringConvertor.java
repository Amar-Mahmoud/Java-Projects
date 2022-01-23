//Amar Mahmoud
//Start of program
import java.util.Scanner;

public class StringConvertor {
	public static void main(String[] args) {
		
		System.out.println("-------****-------****-------****-------****-------");//welcome message
		System.out.println("      Welcome to String Convertor Program          ");
		System.out.println("-------****-------****-------****-------****-------");
		System.out.println("Please enter a string following the format\"number!Name&number!Name&number!Name\":");
		
		int firstandindex = -1;//declaring integers
		int secondandindex = -1;
		int firstexclaindex = -1;
		int secondexclaindex = -1;
		int thirdexclaindex = -1;
		String input;
		
		Scanner scanner= new Scanner(System.in);//creating a scanner
		input=scanner.nextLine();//taking the user input into a string called "input"
		int inputlnth = input.length();//stores the length of a string in an int called "inputlnth"
		
		for(int i = 0; i < inputlnth; ++i){//for loop to repeat until i>inputlnth
			if(input.charAt(i) == '&'){//setting index for "&"

				if(firstandindex == -1){
					firstandindex = i;
				} 	else{
					secondandindex = i;
						break;
				}}}
		String string1 = input.substring(0, firstandindex);//creating different strings depending on the index of the "&"
		String string2 = input.substring(firstandindex + 1, secondandindex);//creating different strings depending on the index of the "&"
		String string3 = input.substring(secondandindex + 1, input.length());//creating different strings depending on the index of the "&"
		
		
		for(int i = 0; i < string1.length(); ++i){// Splitting firstString
			if(string1.charAt(i) == '!'){//setting index for "!"
				firstexclaindex = i;
				break;
			}
		}
		for(int i = 0; i < string2.length(); ++i){// Splitting secondString
			if(string2.charAt(i) == '!'){//setting index for "!"
				secondexclaindex = i;
				break;
			}
		}
		for(int i = 0; i < string3.length(); ++i){// Splitting thirdString
			if(string3.charAt(i) == '!'){//setting index for "!"
				thirdexclaindex = i;
				break;
			}
		}
		String string11  = string1.substring(0, firstexclaindex);//creating new String"string11" from string1 index 0 to the firstexclaindex
		int p1=Integer.parseInt(string11);  //converting string to integer
		String firststring2 = string1.substring(firstexclaindex + 1, string1.length());
		
		String string22 = string2.substring(0, secondexclaindex);//creating new String"string22" from string2 index 0 to the secondexclaindex
		int p2=Integer.parseInt(string22);  //converting string to integer
		String secondString2 = string2.substring(secondexclaindex + 1, string2.length());
		
		String string33 = string3.substring(0, thirdexclaindex);//creating new String"string33" from string3 index 0 to the thirdexclaindex
		int p3=Integer.parseInt(string33);  //converting string to integer
		String thirdString2 = string3.substring(thirdexclaindex + 1, string3.length()).replace("&", "");
		
		int total=p1+p2+p3; //total = the sum of the 3 numbers
		
		if(total==0) {//if the value of total = 0 then display the following message.
			System.out.println("You have 0 items now!");
		}
		else {//else, display how much of each and the total.
			System.out.println("You have "+p1+" "+firststring2+", "+p2+" "+secondString2+", "+p3+" "+thirdString2+", and there are "+total+" items in total.");
		}
		
		System.out.println("\nThank you for using this program!!");//displays exit message
		
		scanner.close();   //closing the scanner
	}
}
//end of program