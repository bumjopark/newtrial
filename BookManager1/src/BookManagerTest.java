import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {
	private BookManagerTest bookManagerTest;
	Book book1 = new Book(1, "자바 기초", "Jane", 2021);
	Book book2 = new Book(2, "소프트웨어 공학", "Tom", 2014);
	Book book3 = new Book(3, "분산 컴퓨팅", "Yoon", 2024);
	Book book4 = new Book(4, "분산 컴퓨팅2", "Yoon", 2024);
	BookManager bookManager = new BookManager();
	@BeforeEach
	void setUp() throws Exception {
		bookManagerTest = new BookManagerTest();
		System.out.println("새 BookManagerTest 생성");
	}

	@Test
	void testAddBook() {
		bookManager.AddBook(book1);
		bookManager.AddBook(book1);
		bookManager.SearchBook(book1);
	}

	@Test
	void testSearchBook() {
		bookManager.AddBook(book1);
		bookManager.AddBook(book2);
		bookManager.AddBook(book3);
		bookManager.SearchBook(book1);
		bookManager.SearchBook(book2);
		bookManager.SearchBook(book3);
		
	}

	@Test
	void testRemoveBook() {
		bookManager.SearchBook(book1);
		bookManager.AddBook(book1);
		bookManager.AddBook(book2);
		bookManager.RemoveBook(book1);
		bookManager.RemoveBook(book1);
		bookManager.SearchBook(book1);
	}

}
