//This program will be used at a medical marijuana dispensary
import java.util.Scanner; //This will read user input

class MaryJane1 { //this is the main class where the variables are defined
	public static void main(String args[])
	  throws java.io.IOException {
		
	  int GorillaGlue = 100;
	  int AlienOG = 125;
	  int GSC = 150;
 	  int PurpleDiesel = 130;
	  int Kush = 145;
//This is the intro to the program	
	  System.out.println("Welcome to Manny's Buds, where you will find top shelf product at a competitive price!!");
	  System.out.println ();
//This array will display the prices for the products offered
	  int nums[] = {100, 125, 150, 130, 145};
	  int i;
	  int size; 

	  size = 5;
	  System.out.println("These are the products we are offering along with the prices. *Prices are per ounce.*");
	   System.out.println(); 
	  System.out.println("When finished ordering press e, followed by enter.");
	  System.out.println();
	  System.out.println("\t Gorilla  Alien  GSC   Diesel  Kush");
//this for loop controls the array
	  for(i = 0; i < size; i++)
	    System.out.print("  \t " + nums[i]);
	    System.out.println();
	    System.out.println();
//Here is a switch statement
	  char choice, ignore;

       for(;;) { 	
	do { 
	   System.out.println("Chose from our following options: ");
	   System.out.println(" 1.GorillaGlue = 100 ");
	   System.out.println(" 2.AlienOG = 125");
	   System.out.println(" 3.GSC = 150");
	   System.out.println(" 4.PurpleDiesel = 130");
	   System.out.println(" 5.Kush = 145 ");
	
	   choice = (char) System.in.read();

	   do {
	     ignore = (char) System.in.read();
	   } while (ignore != '\n');
	} while (choice < '1' | choice > '5' & choice != 'e');

	   if(choice == 'e') break;

	  int m, o;
	  double total;

	  Scanner input = new Scanner(System.in);	
//This is where the calculations will take place and the total will be displayed
	  System.out.println("Enter the number next to your selection.");
	  m = input.nextInt();
	
	  System.out.println("You have entered " + m);

	  System.out.println("Enter the amount of ounces you wish to purchase.");
	  o = input.nextInt();

	  System.out.println("You wish to purchase " + o + " ounces of this product.");

	total = m * o;

	System.out.println("The total amount of todays purchase is " + total);
	
//This is the rest of the switch statement
	System.out.println("\n");

	switch(choice) { 
	  case '1':
		System.out.println("You have selected our top seller: Gorilla Glue!");
	  break;

	  case '2':
		System.out.println("You have selected our best selling indica strain: Alien OG!");
	  break;
	  
	  case '3':
		System.out.println("You have selected our hardest hitting hybrid: GSC!");
	  break;

	  case '4':
		System.out.println("You have selected one of the Purple Diesel vape pens, perfect for any occassion!");
	  break;

	  case '5':
		System.out.println("You have selected a Kush vape pen, great for relaxing after a stressful day!");
	  break;
	   }
	   System.out.println();
	  }
	 }
	}

//end of program 