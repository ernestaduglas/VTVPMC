package lt.vtvpmc.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lt.vtvpmc.demo.model.Book;
import lt.vtvpmc.demo.model.Rating;
import lt.vtvpmc.demo.repository.BookRepository;

@RestController
@Api(value = "book")
@RequestMapping(value = "api/books")
public class BookController {
	private BookRepository repo;
	
	@Autowired
	public BookController(BookRepository repo) {
		this.repo = repo;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get all books", notes = "Returns all available books")
	public List<Book> getAllBooks() {
		return repo.getAllBooks();
	}
	
	@RequestMapping(path = "/{title}", method = RequestMethod.GET)
	@ApiOperation(value = "Get book", notes = "Returns book by book title")
	public Book getBook(@ApiParam(value = "Book title", required = true) @PathVariable String title) {
		return repo.getBook(title);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Add book", notes = "Adds new book")
	public void addBook(@RequestBody @Valid Book book) {
		repo.addBook(book);
}
	
	@RequestMapping(path = "/{title}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value = "Delete book", notes = "Deletes book by title")
	public void deleteBook(@ApiParam(value="Book title", required = true)@PathVariable String title) {
		repo.deleteBook(title);	
	}
	
	@RequestMapping(path = "/{title}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update book", notes = "Updates book rating based on its title")
	public void updateBookRating(@ApiParam(value="Book title", required = true)@PathVariable String title, 
			@RequestBody Rating rating) {
		repo.updateBookRating(title, rating);

	}
	
	

}
