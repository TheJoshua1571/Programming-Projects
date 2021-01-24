/**
*  Testing client of Book class.
*  @author TheJoshua1571
*  @version 1.0
*/

package books;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookApp {
	
	/**
	 *  Contains variable declarations, and console output
	*/
	public static void main(String[] args) {
		
		List <Book> list = new ArrayList<Book>();		
		list.addAll(Book.getList("src/books/books.csv")); //adds all books to 1 ArrayList

		Collections.sort(list); //sorts books in ascending order by title
		System.out.println("Sorted Books");
		System.out.println(list);
		
		Collections.sort(list, Comparator.reverseOrder()); //sorts books in descensing order by title
		System.out.println("Books sorted in reverse order:");
		System.out.println(list);
	}

}
