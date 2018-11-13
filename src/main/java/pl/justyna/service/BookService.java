package pl.justyna.service;

import java.util.List;

import pl.justyna.model.Book;

public interface BookService {

	List<Book> selectAll();
	
	Book selectById(Integer id);
	
	void register(Book book, String bookGenre);
	
	void deleteById(Integer id);
	
	void updateById(Book book);
	
}
