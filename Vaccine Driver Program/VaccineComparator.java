//Amar Mahmoud
//start of program
import java.util.Scanner;

public class VaccineComparator {

	public static void main(String[] args) {

	//creating Vaccine 1 Object
	vaccineObject firstVaccine=new vaccineObject("Pfizer", "mRNA", "BioNTech", 2);
	vaccineObject secondVaccine = new vaccineObject(null, null, null, 0); //creating objects without assigning values to it
	vaccineObject thirdVaccine = new vaccineObject(null, null, null, 0);
	thirdVaccine = secondVaccine; //making the object thirdVaccine equal to the value inputted to secondVaccine
	String tempVar; 
		
	System.out.println("-------------------------------------------");
	System.out.println("-   Vaccine Comparator Testing Program    -");
	System.out.println("-------------------------------------------"); //program header
	
	System.out.println("Create a vaccine object by filling out the following seperated by a space: Name, type, number of doses and company: ");
	Scanner scanner = new Scanner(System.in);

	//assigning each to a temp variable and changing the variable each entry
	tempVar= scanner.next(); 
	secondVaccine.setName(tempVar);

	tempVar= scanner.next();
	secondVaccine.setType(tempVar);
	tempVar=scanner.next();

	//transforming the string to a int variable to display
	int dose=Integer.parseInt(tempVar); 
	secondVaccine.setDose(dose);

	tempVar=scanner.next();
	secondVaccine.setCompany(tempVar);
	
	
	System.out.println("\nVaccine 1: ");
	System.out.println(" Name:"+firstVaccine.getName()+", Type:"+firstVaccine.getType()+", Dose:"+firstVaccine.getDose()+", Company:"+ firstVaccine.getCompany());
	//using the getters we get the values of each of these from the setters 
	System.out.println("\nVaccine 2: ");
	System.out.println(" Name:"+secondVaccine.getName()+", Type:"+secondVaccine.getType()+", Dose:"+secondVaccine.getDose()+", Company:"+ secondVaccine.getCompany());
	System.out.println("\nVaccine 3: ");
	System.out.println(" Name:"+thirdVaccine.getName()+", Type:"+thirdVaccine.getType()+", Dose:"+thirdVaccine.getDose()+", Company:"+ thirdVaccine.getCompany());
	
	System.out.println("\nComparing Vaccine 2 & 3 ");
	System.out.println("The vaccine info");
	System.out.println(" Name:"+secondVaccine.getName()+", Type:"+secondVaccine.getType()+", Dose:"+secondVaccine.getDose()+", Company:"+ secondVaccine.getCompany());

	//testing for equality of the info using the equals method
	if(secondVaccine.equals(thirdVaccine)) { 
		System.out.println(" is equal to The vaccine info");
		
	}
	else {}
	System.out.println(" Name:"+thirdVaccine.getName()+", Type:"+thirdVaccine.getType()+", Dose:"+thirdVaccine.getDose()+", Company:"+ thirdVaccine.getCompany());
	
	System.out.println("\nChange first Vaccine info to: Name, Type, Doses, Company ");
	tempVar= scanner.next(); //changing the values that the temp variables took to take the new ones
	firstVaccine.setName(tempVar); //setting new values for firstVaccine
	tempVar= scanner.next();
	firstVaccine.setType(tempVar);
	tempVar=scanner.next();
	dose=Integer.parseInt(tempVar); //transforming the string to a int variable to display
	firstVaccine.setDose(dose);
	tempVar=scanner.next();
	firstVaccine.setCompany(tempVar);
	System.out.println("\nVaccine 1 has now been changed to: ");
	System.out.println(" Name:"+firstVaccine.getName()+", Type:"+firstVaccine.getType()+", Dose:"+firstVaccine.getDose()+", Company:"+ firstVaccine.getCompany());
	
	
	System.out.println();
	System.out.println("\nThank you for using this program"); //closing message

	scanner.close();  //closing the scanner
	}
}
class vaccineObject {

	//initializing private variables
	private String name;  	
	private String type;	
	private String company;
	private int dose;	  	
	

	//equals method
	public boolean equals(Object obj) { 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
			vaccineObject other = (vaccineObject) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (dose != other.dose)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;// tested all values of input to check for equality
		return true;
	}
	//vaccine object
	public vaccineObject(String name, String type, String company, int dose) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
		this.dose = dose;
	}
	//toString method
	public String toString() {
		return "Vaccine [name=" + name + ", type=" + type + ", company=" + company + ", dose=" + dose + "]";
	}

	//Getters & Setters
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	
	}

}
//end of program