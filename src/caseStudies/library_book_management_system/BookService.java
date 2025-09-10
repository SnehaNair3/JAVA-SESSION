package caseStudies.library_book_management_system;

import java.util.ArrayList;
import java.util.List;

public class BookService {

	private List<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		books.add(book);
	}

	public void displayAllBooks() {
		for (Book b : books) {
			System.out.println(b);
		}
	}
	
	public Book searchBookByTitle(String title) {
		for(Book b : books) {
			if(b.getTitle().equalsIgnoreCase(title)) {
				return b;
			}
		}
		return null;
	}
}
