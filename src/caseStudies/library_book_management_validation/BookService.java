package caseStudies.library_book_management_validation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import caseStudies.library_book_management_advanced.Book;
import caseStudies.library_book_management_validation.exceptions.DuplicateBookIdException;
import caseStudies.library_book_management_validation.exceptions.DuplicateTitleException;
import caseStudies.library_book_management_validation.exceptions.InvalidAuthorException;
import caseStudies.library_book_management_validation.exceptions.InvalidBookIdException;
import caseStudies.library_book_management_validation.exceptions.InvalidBookTitleException;
import caseStudies.library_book_management_validation.exceptions.InvalidYearException;

public class BookService {
	private List<Book2> books = new ArrayList<Book2>();

	// add a book if it does not exist
	public boolean validateAndAddBook(caseStudies.library_book_management_validation.Book2 book)
			throws InvalidBookIdException, InvalidBookTitleException, DuplicateBookIdException, DuplicateTitleException,
			InvalidAuthorException, InvalidYearException {

		// ID Validation
		if (book.getId() <= 0) {
			throw new InvalidBookIdException("Book ID must be a positive integer.");
		}

		// title validation
		if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
			throw new InvalidBookTitleException("Book title cannot be empty.");
		}

		// author validation
		if (book.getAuthor() == null || book.getAuthor().trim().isEmpty()) {
			throw new InvalidAuthorException("Author cannot be empty.");
		}

		// year validation
		if (book.getYear() == 0) {
			throw new InvalidYearException("Year cannot be empty.");
		}
		if (book.getYear() < 0) {
			throw new InvalidYearException("year must be a positive integer.");
		}

		for (Book2 b : books) {
			if (b.getId() == book.getId()) {
				throw new DuplicateBookIdException("Book ID should not be duplicate.");
			}

			if (b.getTitle() == book.getTitle()) {
				throw new DuplicateTitleException("Book title cannot be duplicate.");
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
			for (Book2 b : books) {
				System.out.println(b);
			}
		}
	}

	// Search book by title
	public Book2 searchBookByTitle(String title) {
		for (Book2 b : books) {
			if (b.getTitle().equalsIgnoreCase(title)) {
				return b;
			}
		}
		return null;
	}

	// search books by author
	public List<Book2> searchBooksByAuthor(String author) {
		List<Book2> result = new ArrayList<Book2>();
		for (Book2 b : books) {
			if (b.getAuthor().equalsIgnoreCase(author)) {
				result.add(b);
			}
		}
		return result;
	}

	// delete book by id
	public boolean deleteBookById(int id) {
		Iterator<Book2> iterator = books.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getId() == id) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	// sort books by year
	public void sortBooksByYear() {
		books.sort(Comparator.comparingInt(Book2::getYear));
	}

	// get the total number of books
	public int getTotalBooks() {
		return books.size();
	}
}
