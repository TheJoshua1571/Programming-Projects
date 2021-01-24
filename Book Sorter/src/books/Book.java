/**
 * Contains instance variables and constructor for a Book object.
 * @author TheJoshua1571
 * @version 1.0
 * 
 * */

package books;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable <Book>{

	private String title;
	private String author;
	private int year;
	
	/**
	 * Constructor for a book object.
	 * @param title (String)Title of book
	 * @param author (String) Author of book
	 * @param year (int) Year the book was released
	 */
	public Book (String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}
	
	/**
	 *  Returns the list of books in a CSV file.
	 * @param file CSV File that contains the book list.
	 * @return Returns an ArrayList with books
	 */
	public static List<Book> getList(String file){
		List <Book> list = new ArrayList<Book>();
		BufferedReader br = null;
        String cvsSplitBy = ",";
        int recordCount = 0; //counts the number of books in the csv file
        
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			
			while ((line = br.readLine()) != null) {
				String[] row = line.split(cvsSplitBy);
				 
				 if (row.length != 3) { //used for validation of 3 rows (title, author, year)
		                System.err.println("Problem encountered while reading the following line: " + (recordCount + 1)); //error handling for wrong format in csv file
		                continue; //allows program to continue running after error
		            }
				 
				 list.add(new Book(row[0], row[1], Integer.parseInt(row[2])));
				 recordCount++;
				 
			} 
			
			System.out.println("Number of books: " + recordCount + "\n");
			
		}	
		
		catch (FileNotFoundException e) {
			e.getStackTrace();
		}	
		
		catch (IOException e) {
			e.getStackTrace();
		}
		
		return list;
	
	}
	
	/**
	 * Formats the output of the CSV file.
	 */
	@Override
	public String toString() {
		return "'" + this.title + "'" + " by " + this.author + " (" + this.year + ")" + "\n";
	}
	
	/**
	 * Compares 2 objects of type Book and sorts them alphabetically.
	 */
	@Override
	public int compareTo(Book o) {
		
		if (getTitle().compareTo(o.getTitle()) > 0 ) {
			return 1;
			
		} else if (getTitle().compareTo(o.getTitle()) < 0){
			return -1;
			
		} else {
			return 0;
		}
	}
}
