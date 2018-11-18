package pl.justyna.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.justyna.model.Book;
import pl.justyna.model.Genre;
import pl.justyna.model.GenreOfBook;
import pl.justyna.service.GenreService;

@RestController
@RequestMapping("genres")
public class GenreController {
	
	@Autowired
	private GenreService genreSerivce;
	
	@GetMapping("/{id}")
	public Genre getById(@PathVariable Integer id) {
		return genreSerivce.selectById(id);
	}
	
	@GetMapping
	public List<Genre> getAll(){
		return genreSerivce.selectAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteByid(@PathVariable Integer id) {
		genreSerivce.deleteById(id);
	}
	
	@GetMapping("/byBookGenre/{nameGenre}")
	public List<Book> selectByGenreBook(@PathVariable GenreOfBook nameGenre){
		return genreSerivce.selectByGenreBook(nameGenre);
	}

}
