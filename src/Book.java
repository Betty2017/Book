
public class Book {
	
	private String bookTitle;
	private String autor;
	private String description;
	private int price;
	private String inStock;
	
	public String getbookTitle(){
		return bookTitle;
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle= bookTitle;
	}
	public void setAutor(String autor){
		this.autor= autor;
	}
	public void setDescription(String description){
		this.autor= description;
	}
	public void setPrice(int price){
		this.price= price;
	}
	public void setInStock(String inStock){
		this.inStock= inStock;
	}
	//default constractor
	public Book(){
		bookTitle = "The Note Book";
		autor = "Nicholas Sparks";
		description = "Romantic" ;
		price = 10;
		inStock = "yes";
	}
	
	public String  getDisplayText ()
	{
		return bookTitle+ "\n"+ autor+"\n"+description;
	}
	
}
	
