package pl.justyna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.justyna.model.Book;
import pl.justyna.service.BookService;

@RestController
@RequestMapping("books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/{bookGenre}")
	public void register(@RequestBody Book book, @PathVariable String bookGenre) {
		bookService.register(book, bookGenre);
	}
	
	@GetMapping("/{id}")
	public Book getById(@PathVariable Integer id) {
		return bookService.selectById(id);
	}
	
	@GetMapping
	public List<Book> getAll(){
		return bookService.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		bookService.deleteById(id);
	}
	
	@PutMapping
	public void updateById(@RequestBody Book book) {
		bookService.updateById(book);
	}

}
