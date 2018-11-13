package pl.justyna.model;

public class Book {
	
	private Integer id;
	
	private String name;
	
	private String author;
	
	private GenreOfBook genreOfBook;
	
	private Integer yearOfPublishment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public GenreOfBook getGenreOfBook() {
		return genreOfBook;
	}

	public void setGenreOfBook(GenreOfBook genreOfBook) {
		this.genreOfBook = genreOfBook;
	}

	public Integer getYearOfPublishment() {
		return yearOfPublishment;
	}

	public void setYearOfPublishment(Integer yearOfPublishment) {
		this.yearOfPublishment = yearOfPublishment;
	}

	@Override
	public String toString() {
		return "Book [id = " + id + ", name = " + name + ", author = " + author + ", genreOfBook = " + genreOfBook
				+ ", yearOfPublishment = " + yearOfPublishment + "]";
	}
	
	

}
