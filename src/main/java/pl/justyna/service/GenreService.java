package pl.justyna.service;

import java.util.List;

import pl.justyna.model.Book;
import pl.justyna.model.Genre;
import pl.justyna.model.GenreOfBook;

public interface GenreService {

	List<Genre> selectAll();
	
	Genre selectById(Integer id);
	
	List<Book> selectByGenreBook(GenreOfBook nameGenre);
	
	void deleteById(Integer id);
	
	GenreOfBook searchByGenreName(String bookGenre);
}
