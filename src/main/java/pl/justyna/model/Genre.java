package pl.justyna.model;

import java.util.ArrayList;
import java.util.List;

public class Genre {

	private Integer id;
	
	private GenreOfBook name;
	
	private List<Book> books = new ArrayList<Book>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GenreOfBook getName() {
		return name;
	}

	public void setName(GenreOfBook name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Genre [id = " + id + ", name = " + name + ", books = " + books + "]";
	}



}
