package lt.vtvpmc.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import lt.vtvpmc.demo.model.Book;
import lt.vtvpmc.demo.model.Rating;

@Repository
public class BookRepositoryImpl implements BookRepository {
	private List<Book> books = new ArrayList<Book>();

	@Override
	public List<Book> getAllBooks() {
		return books;
	}

	@Override
	public Book getBook(String title) {
		Book book = null;
		for(Book element: books) {
			if(element.getTitle().equals(title)) {
				book = element;
			}
		}
		return book;
	}

	@Override
	public void addBook(Book book) {
		books.add(book);
		System.out.println("added");

	}

	@Override
	public void deleteBook(String title) {
		for(Book element: books) {
			if(element.getTitle().equals(title)) {
				books.remove(element);
				System.out.println("deleted");
			}
		}

	}
	
	@Override
	public void updateBookRating(String title, Rating rating) {
		for(Book element: books) {
			if(element.getTitle().equals(title)) {
				element.addRating(rating);
				System.out.println("updated");
			}
	}
	
	}
}
