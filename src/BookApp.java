
public class BookApp {

	public static void main(String[] args) {
		Book b = new Book();
		Book bo = new Book("The Alchemist","Paulo Coelho","Adventure fiction");
		System.out.println(b.getbookTitle());
		System.out.println(b.getDisplayText());
		System.out.println("\n");
		System.out.println(bo.getbookTitle());
		System.out.println(bo.getDisplayText());
		
		

	}

}
