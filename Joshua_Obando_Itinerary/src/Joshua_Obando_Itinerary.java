/**
 *  The following program will ask the user for a series of destinations
 *  as input, and display their full itinerary as output.
 * @author Josh Obando
 * @version 1.0
*/

import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class Joshua_Obando_Itinerary 
{
	
	/**
	 * This class counts the length of the elements inside of the userDest ArrayList.
	 */
	
	public static ArrayList<Integer> lengths(ArrayList<String> userDest) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        for (String s : userDest)
            lengthList.add(s.length());
        return lengthList;
}
	
	public static void main(String[] args) {
		
		/**
		 *  The main method contains variable declarations, and console output
		*/
        
		ArrayList<String> userDest = new ArrayList<String>();
		Scanner userKey = new Scanner(System.in);
		System.out.println("Welcome to Josh's Itinerary Builder!");
		System.out.println("Please enter your destinations, when you are finished, type 'Done'.");
		
		/**
		 *  The following loop will dynamically increase the size of the ArrayList and
		 *  ask the user for their destinations as input until the keyword 'Done' (not case sensitive) has been typed.
		*/
		
		do
		{
			System.out.print("Destination: ");
			userDest.add(userKey.nextLine());
			for (int i = 0; i < userDest.size(); i++){}
			
		} while (!"Done".equalsIgnoreCase(userDest.get(userDest.size() - 1 )));
		
		/**
		 * The .remove() method here will delete the "done" entry in the ArrayList
		 */
		userDest.remove(userDest.size() - 1);
		
		
		/**
		 * The lengths class will take the character length from the userDest ArrayList, and return it as an ArrayList
		 */
		ArrayList<Integer> lengths = lengths(userDest);
		
		String destsAll = userDest.toString()
		
		/**
		 *The following methods will replace the commas and square brackets from the ArrayList
		 */
				
		.replace(",", "")
		.replace("[", "")
		.replace("]", "")
		.trim();
		
		StringBuilder destsOutput = new StringBuilder();
	
		destsOutput.append(destsAll.toUpperCase());
		
		int c = 0;		
		
		/**
		 * The position variable is used to assign the position where the first instance of " to" on the Itinerary will be added, depending on the character length of the first element of userDest
		 */
		int position = lengths.get(0);
		
		/**
		 * The following loop will add " to" after each element of the userDest ArrayList
		 */
		
		while( c < userDest.size()-1) {
						
			destsOutput.insert(position, " to");
			position = (position + 4) + lengths.get(c+1);
			c++;
		}
	
		destsOutput.insert(0,"Itinerary: ");
		System.out.println(destsOutput);
		userKey.close();
	}
}
