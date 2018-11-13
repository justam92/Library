package pl.justyna.controller;

import java.util.List;

import pl.justyna.model.Book;
import pl.justyna.service.BookService;
import pl.justyna.serviceImpl.BookServiceImpl;

public class BookController {
	
	private BookService bookService = new BookServiceImpl();
	
	public void register(Book book, String bookGenre) {
		bookService.register(book, bookGenre);
	}
	
	public Book getById(Integer id) {
		return bookService.selectById(id);
	}
	
	public List<Book> getAll(){
		return bookService.selectAll();
	}
	
	public void deleteById(Integer id) {
		bookService.deleteById(id);
	}
	
	public void updateById(Book book) {
		bookService.updateById(book);
	}

}
