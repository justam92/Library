package pl.justyna.controller;

import java.util.List;

import pl.justyna.model.Book;
import pl.justyna.model.Genre;
import pl.justyna.model.GenreOfBook;
import pl.justyna.service.GenreService;
import pl.justyna.serviceImpl.GenreServiceImpl;

public class GenreController {
	
	private GenreService genreSerivce = new GenreServiceImpl();
	
	public Genre getById(Integer id) {
		return genreSerivce.selectById(id);
	}
	
	public List<Genre> getAll(){
		return genreSerivce.selectAll();
	}
	
	public void deleteByid(Integer id) {
		genreSerivce.deleteById(id);
	}
	
	public List<Book> selectByGenreBook(GenreOfBook nameGenre){
		return genreSerivce.selectByGenreBook(nameGenre);
	}

}
