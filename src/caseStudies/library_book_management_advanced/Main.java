package caseStudies.library_book_management_advanced;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BookService bookService = new BookService();
		int choice;
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
			choice = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (choice) {
			case 1:
				Book book = new Book();
				System.out.println("Enter book ID :");
				book.setId(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Enter book title : ");
				book.setTitle(scanner.nextLine());
				System.out.println("Enter book author : ");
				book.setAuthor(scanner.nextLine());
				System.out.println("Enter book year : ");
				book.setYear(scanner.nextInt());
				if (bookService.addBook(book)) {
					System.out.println("Book added successfully.");
				} else {
					System.out.println("Duplicate ID. Book not added.");
				}
				break;

			case 2:
				bookService.displayAllBooks();
				break;

			case 3:
				System.out.println("Enter the title to search : ");
				String title = scanner.nextLine();
				Book found = bookService.searchBookByTitle(title);
				System.out.println(found != null ? found : "Book not found.");
				break;

			case 4:
				System.out.println("Enter the author name to search : ");
				String author = scanner.nextLine();
				List<Book> booksByAuthor = bookService.searchBooksByAuthor(author);
				if (booksByAuthor.isEmpty()) {
					System.out.println("No books found.");
				} else {
					booksByAuthor.forEach(System.out::println);
				}
				break;

			case 5:

				System.out.println("Enter the book ID to delete : ");
				int delId = scanner.nextInt();
				if (bookService.deleteBookById(delId)) {
					System.out.println("Book deleted successfully.");
				} else {
					System.out.println("ID not found.");
				}
				break;

			case 6:
				bookService.sortBooksByYear();
				System.out.println("Books sorted in year : ");
				bookService.displayAllBooks();
				break;

			case 7:
				System.out.println("Total number of books : ");
				int count=bookService.getTotalBooks();
				System.out.println(count);
				break;

			case 8:
				System.out.println("Exiting the application..");
				break;

			default:
				System.out.println("Invalid choice..Please enter a valid choice.");
			}

		} while (choice != 8);

		scanner.close();
	}
}
