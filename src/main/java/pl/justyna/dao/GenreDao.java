package pl.justyna.dao;

import java.util.List;

import pl.justyna.model.Book;
import pl.justyna.model.Genre;
import pl.justyna.model.GenreOfBook;

public interface GenreDao {
	
	List<Genre> selectAll();
	
	Genre selectById(Integer id);
	
	void deleteById(Integer id);
	
	List<Book> selectByGenreBook(GenreOfBook nameGenre);

}
