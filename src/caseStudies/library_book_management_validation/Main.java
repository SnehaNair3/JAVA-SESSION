package caseStudies.library_book_management_validation;

import java.util.List;
import java.util.Scanner;

import caseStudies.library_book_management_validation.exceptions.InvalidBookIdException;
import caseStudies.library_book_management_validation.exceptions.InvalidYearException;
import caseStudies.library_book_management_validation.BookService;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BookService bookService2 = new BookService();
		int choice=-1;
		do {
			System.out.println("📕📕📕📕📕📕Library Menu📖📖📖📖📖📖📖");
			System.out.println("1. Add Book");
			System.out.println("2. View All Books");
			System.out.println("3. Search Book by Title");
			System.out.println("4. Search Books by Author");
			System.out.println("5. Delete Book by ID");
			System.out.println("6. Sort Books by Year");
			System.out.println("7. Get Total Book Count");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				scanner.nextLine(); // consume newline
			} else {
				System.out.println("Invalid choice..choice must be a positive integer.");
				scanner.next(); // Clear invalid input
				continue;
			}

			switch (choice) {
			case 1:
				try {
					System.out.println("Enter book ID :");
					if (!scanner.hasNextInt()) {
						throw new InvalidBookIdException("Id must be an integer");
					}
					int id = scanner.nextInt();
					scanner.nextLine();

					System.out.println("Enter book title:");
					String title = scanner.nextLine();

					System.out.println("Enter book author :");
					String author = scanner.nextLine();

					System.out.println("Enter year of publishing : ");
					if (!scanner.hasNextInt()) {
						throw new InvalidYearException("year must be an integer.");
					}
					int year = scanner.nextInt();
					scanner.nextLine();

					Book2 book = new Book2(id, title, author, year);
					bookService2.validateAndAddBook(book);

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;

			case 2:
				bookService2.displayAllBooks();
				break;

			case 3:
				System.out.println("Enter title to search : ");
				String searchTitle = scanner.nextLine();
				Book2 foundTitle = bookService2.searchBookByTitle(searchTitle);
				if (foundTitle != null) {
					System.out.println(foundTitle);
				} else {
					System.out.println("Book not found.");
				}
				break;

			case 4:
				System.out.println("Enter author name to search:");
				String searchAuthor = scanner.nextLine();
				List<Book2> foundBooks = bookService2.searchBooksByAuthor(searchAuthor);
				if (foundBooks.isEmpty()) {
					System.out.println("No books found for that author.");
				} else {
					foundBooks.forEach(System.out::println);
				}
				break;

			case 5:
				System.out.println("Enter book ID to delete:");
				if (scanner.hasNextInt()) {
					int deleteId = scanner.nextInt();
					scanner.nextLine();
					if (bookService2.deleteBookById(deleteId)) {
						System.out.println("Book deleted successfully.");
					} else {
						System.out.println("Book ID not found.");
					}
				} else {
					System.out.println("Invalid input. ID must be an integer.");
					scanner.next();
				}
				break;

			case 6:
				bookService2.sortBooksByYear();
				System.out.println("Books sorted by year:");
				bookService2.displayAllBooks();
				break;

			case 7:
				System.out.println("Total number of books: " + bookService2.getTotalBooks());
				break;

			case 8:
				System.out.println("Exiting the application. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 8.");
				break;
			}

		} while (choice != 8);
		scanner.close();
	}
}
