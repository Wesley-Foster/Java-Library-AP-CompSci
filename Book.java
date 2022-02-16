
public class Book {
	
	private String bTitle;
	private String bAuthor;
	private String bGenre;
	private String bBlerb;
	
	
	public Book(String title, String author, String genre, String blerb) 
	{
		bTitle = title;
		bAuthor = author;
		bGenre = genre;
		bBlerb = blerb;
	}
	
	public String getTitle()
	{
		return bTitle;
	}
	
	public String getAuthor()
	{
		return bAuthor;
	}
	
	public String getGenre()
	{
		return bGenre;
	}
	
	public String getBlerb()
	{
		return bBlerb;
	}
	
}
