package hw1;
import java.util.*;


/**
 * MyFirstCalendarTester is a test class for MyFirstCalendar 
 * It shows the main menu - displays and takes the options 
 * @author Marietta Asemwota 
 */
public class MyCalendarTester {

	public static void main(String [] args){
		MyCalendar mfc = new MyCalendar(); 
		
		//display this months calendar 
		mfc.displayMonth();
		System.out.println(" ");
		
		//main event loop of the program 
		System.out.println("Select one of the following options: ");
		System.out.println("[L]oad [V]iew by [C]reate [G]o to [E]vent list [D]elete [Q]uit");
		
		Scanner in = new Scanner(System.in); 
		 
		while (in.hasNextLine()) {
			String action = in.nextLine(); //user action

			if (action.equalsIgnoreCase("L"))
				mfc.load();
			else if (action.equalsIgnoreCase("V"))
				mfc.viewBy();
			else if (action.equalsIgnoreCase("C"))
				mfc.create();
			else if (action.equalsIgnoreCase("G"))
				mfc.goTo();
			else if (action.equalsIgnoreCase("E"))
				mfc.eventList();
			else if (action.equalsIgnoreCase("D"))
				mfc.delete();
			else if (action.equalsIgnoreCase("Q"))
			{
				//confirm they want to quit
				System.out.println("Do you want to quit? (Y / N)");
				String check = in.nextLine();
				
				if(check.equalsIgnoreCase("Y"))
				{
					mfc.quit();
					return;
				}
			}
			else 
			{
				System.out.println("Invalid key option. Please try again");
			}
			
			//run the loop again
			System.out.println(" ");
			mfc.displayMonth();
			System.out.println(" \n");
			
			System.out.println("Select one of the following options: ");
			System.out.println("[L]oad [V]iew by [C]reate [G]o to [E]vent list [D]elete [Q]uit");
		}
		in.close();
		
		System.out.println(" ");
	}
	}
