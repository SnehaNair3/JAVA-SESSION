package caseStudies.library_book_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BookService bookService = new BookService();
		System.out.println("Enter the number of books you wanna store : ");
		int n = scanner.nextInt();
		System.out.println();

		

		for (int i = 0; i < n; i++) {
			Book book=new Book();
			System.out.println("Enter the details for Book " + (i + 1));
			System.out.println("Enter the book ID : ");
			int id = scanner.nextInt();
			book.setId(id);
			scanner.nextLine();
			System.out.println("Enter the book title :");
			String title = scanner.nextLine();
			book.setTitle(title);
			System.out.println("Enter the author of the book :");
			String author = scanner.nextLine();
			book.setAuthor(author);
			System.out.println("Enter the year published : ");
			int year = scanner.nextInt();
			book.setYear(year);

			bookService.addBook(book);

		}
		scanner.nextLine();

		// Print all books using a loop
		System.out.println("Book details : ");
		bookService.displayAllBooks();
		
		// Ask user to enter a title to search
		System.out.println("Enter a title to search : ");
		String searchTitle = scanner.nextLine();
		Book bookFound = bookService.searchBookByTitle(searchTitle);
		if(bookFound != null) {
			System.out.println(bookFound);
		}else {
			System.out.println("Book Not Found ");
		}

		scanner.close();

	}
}
