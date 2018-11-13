package pl.justyna.dao;

import java.util.List;

import pl.justyna.model.Book;

public interface BookDao {
	
	List<Book> selectAll();
	
	Book selectById(Integer id);
	
	void register(Book book);
	
	void updateById(Book book);
	
	void deleteById(Integer id);

}
