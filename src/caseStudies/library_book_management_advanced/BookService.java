package caseStudies.library_book_management_advanced;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BookService {
	private List<Book> books = new ArrayList<Book>();

	// add a book if it does not exist
	public boolean addBook(Book book) {
		for (Book b : books) {
			if (b.getId() == book.getId()) {
				return false;
			}

		}
		books.add(book);
		return true;
	}

	// display all books
	public void displayAllBooks() {
		if (books.isEmpty()) {
			System.out.println("No books available.");
		} else {
			for (Book b : books) {
				System.out.println(b);
			}
		}
	}

	// Search book by title
	public Book searchBookByTitle(String title) {
		for (Book b : books) {
			if (b.getTitle().equalsIgnoreCase(title)) {
				return b;
			}
		}
		return null;
	}

	// search books by author
	public List<Book> searchBooksByAuthor(String author) {
		List<Book> result = new ArrayList<Book>();
		for (Book b : books) {
			if (b.getAuthor().equalsIgnoreCase(author)) {
				result.add(b);
			}
		}
		return result;
	}

	// delete book by id
	public boolean deleteBookById(int id) {
		Iterator<Book> iterator = books.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getId()== id) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}
	
	
	//sort books by year
	public void sortBooksByYear() {
		books.sort(Comparator.comparingInt(Book::getYear));
	}
	
	//get the total number of books
	public int getTotalBooks() {
		return books.size();
	}

}
