package zodiacSigns;

import java.util.Scanner;

public class Sign {

	//loop it out
	public static void main(String[] args) {
		boolean exitZodiac = false;
		
		do
		{
		
		System.out.println("Please enter the number which is your birthday month");
		Scanner scan = new Scanner(System.in);
		int userinput = scan.nextInt();
		
		switch (userinput) 
			{ //userinput = month
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Feburary");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("January");
				break;
			default:
				System.out.println("Invalid Entry");
				
				
			}
		} while (exitZodiac != true);

	}

}
