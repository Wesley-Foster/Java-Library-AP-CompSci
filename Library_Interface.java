import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.BufferedReader;
public class Library_Interface {
	
	
	public static void main(String args[]) throws IOException
	{
		FileReader file = new FileReader("Books.txt");
		BufferedReader bookFile = new BufferedReader(file);
		Scanner input = new Scanner(System.in);
		
		//Top of Book file as a string
		String bookString = "";
		 int n;    
         while((n=bookFile.read())!=-1){  
         bookString = bookString + ((char)n);  
         }  
		//Bottom of book file string
         String[] bookSplit = bookString.split("-");
        //
        boolean run = true; 
		
        Mainloop:
		while(run)
		{
			System.out.println("Enter 1 to Search for a book by Title, enter 2 to search by genre, enter 3 to add a book, or enter 4 to quit");
			int UserOption = input.nextInt();
			
			//Choice if statement
			if(UserOption == 1)
			{
				System.out.println("Enter the full book title");
				input.nextLine();
				String BookOption = input.nextLine();
				Book SearchedBook = GetBookWTitle(BookOption);
				
				
			}
			else if(UserOption == 2)
			{
				
			}
			else if(UserOption == 3)
			{
				
			}
			else if(UserOption == 4)
			{
				break Mainloop;
			}
			
		}
   
		//close the files and reader
		file.close();
		bookFile.close();
	}
	
	
	
	//Other Functions
	
	//Get a book given the title
	public static Book GetBookWTitle(String bookTitle) throws IOException
	{
		FileReader file = new FileReader("Books.txt");
		BufferedReader bookFile = new BufferedReader(file);
		
		//Top of Book file as a string
		String bookString = "";
		 int n;    
         while((n=bookFile.read())!=-1){  
         bookString = bookString + ((char)n);  
         }  
		//Bottom of book file string
	    String[] bookSplit = bookString.split("-");
		//End of file setup
	    int bookNum = 0;
	    
	    
		int booksLen = bookSplit.length;
		forloop:
		for(int i = 0; i <= booksLen; i++)
		{
			String[] singleBook = bookSplit[i].split("\n");
			if(singleBook[0].equalsIgnoreCase(bookTitle))
			{
				bookNum = i;
				break forloop;
			}
		}
		//end of finding the books
		String[] userBook = bookSplit[bookNum].split("\n");
				
		Book newBook = new Book(userBook[0], userBook[1], userBook[3], userBook[2]);
		return newBook;
	}
	
	public static String[] getBookWGenre(String input)
	{
		String[]
	}
	

	
}
