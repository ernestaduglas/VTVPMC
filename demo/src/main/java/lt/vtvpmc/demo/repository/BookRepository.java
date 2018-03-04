package lt.vtvpmc.demo.repository;

import java.util.List;

import lt.vtvpmc.demo.model.Book;
import lt.vtvpmc.demo.model.Rating;

public interface BookRepository {
	
	List <Book> getAllBooks();
	Book getBook(String title);
	void addBook(Book book);
	void deleteBook(String title);
	void updateBookRating(String title, Rating rating);

}
