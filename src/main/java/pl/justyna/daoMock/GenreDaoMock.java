package pl.justyna.daoMock;

import java.util.ArrayList;
import java.util.List;

import pl.justyna.dao.GenreDao;
import pl.justyna.model.Book;
import pl.justyna.model.Genre;
import pl.justyna.model.GenreOfBook;

public class GenreDaoMock implements GenreDao {
	
	private List<Genre> genres = new ArrayList<Genre>();
	
	public GenreDaoMock() {
		
		Book book1 = new Book();
		book1.setId(1);
		book1.setName("Wodecki. Tak mi wysz³o");
		book1.setAuthor("Ba³uk Kamil, Krupiñski Wac³aw");
		book1.setGenreOfBook(GenreOfBook.Biografia);
		book1.setYearOfPublishment(2018);
		
		Book book3 = new Book();
		book3.setId(3);
		book3.setName("Czerwone krzes³o. Magiczne drzewo. Tom 1");
		book3.setAuthor("Maleszka Andrzej");
		book3.setGenreOfBook(GenreOfBook.DlaDzieci);
		book3.setYearOfPublishment(2015);
		
		Book book5 = new Book();
		book5.setId(5);
		book5.setName("Fantastyczne zwierzêta i jak je znaleŸæ. Leksykon");
		book5.setAuthor("Rowling J.K.");
		book5.setGenreOfBook(GenreOfBook.DlaM³odzie¿y);
		book5.setYearOfPublishment(2017);
		
		Book book7 = new Book();
		book7.setId(7);
		book7.setName("WiedŸmin. Tom 1. Ostatnie ¿yczenie");
		book7.setAuthor("Sapkowski Andrzej");
		book7.setGenreOfBook(GenreOfBook.Fantasy);
		book7.setYearOfPublishment(2014);
		
		Book book9 = new Book();
		book9.setId(9);
		book9.setName("Cmêtarz zwie¿¹t");
		book9.setAuthor("King Stephen");
		book9.setGenreOfBook(GenreOfBook.Horror);
		book9.setYearOfPublishment(2009);
		
		Book book11 = new Book();
		book11.setId(11);
		book11.setName("Tokyo Ghoul");
		book11.setAuthor("Sui Ishida");
		book11.setGenreOfBook(GenreOfBook.Komiks);
		book11.setYearOfPublishment(2015);
		
		Book book13 = new Book();
		book13.setId(13);
		book13.setName("Nie odpuszczaj");
		book13.setAuthor("Coben Harlan");
		book13.setGenreOfBook(GenreOfBook.Thriller);
		book13.setYearOfPublishment(2018);

		
		Genre genre1 = new Genre();
		genre1.setId(1);
		genre1.setName(GenreOfBook.Biografia);
		genre1.getBooks().add(book1);
		
		genres.add(genre1);
		
		Genre genre2 = new Genre();
		genre2.setId(2);
		genre2.setName(GenreOfBook.DlaDzieci);
		genre2.getBooks().add(book3);
		
		genres.add(genre2);
		
		Genre genre3 = new Genre();
		genre3.setId(3);
		genre3.setName(GenreOfBook.DlaM³odzie¿y);
		genre3.getBooks().add(book5);
		
		genres.add(genre3);
		
		Genre genre4 = new Genre();
		genre4.setId(4);
		genre4.setName(GenreOfBook.Fantasy);
		genre4.getBooks().add(book7);
		
		genres.add(genre4);
		
		Genre genre5 = new Genre();
		genre5.setId(5);
		genre5.setName(GenreOfBook.Horror);
		genre5.getBooks().add(book9);
		
		genres.add(genre5);
		
		Genre genre6 = new Genre();
		genre6.setId(6);
		genre6.setName(GenreOfBook.Komiks);
		genre6.getBooks().add(book11);
		
		genres.add(genre6);
		
		Genre genre7 = new Genre();
		genre7.setId(7);
		genre7.setName(GenreOfBook.Thriller);
		genre7.getBooks().add(book13);
		
		genres.add(genre7);
	}

	public List<Genre> selectAll() {
		return genres;
	}

	public Genre selectById(Integer id) {
		for(Genre genre : genres) {
			if(genre.getId().equals(id)) {
				return genre;
			}
		}
		
		throw new RuntimeException("Brak gatunku o id: " + id);
	}
	
	public void deleteById(Integer id) {
		System.out.println(" ");
		System.out.println("USUWANIE DANYCH O GATUNKU KSI¥¯EK");
		System.out.println(" ");
		
		List<Genre> genres = selectAll();
		boolean hasGenreBeenFound = false;
		
		for(Genre genre : genres) {
			if(id == genre.getId()) {
				hasGenreBeenFound = true;
				genres.remove(genre);
				break;
			}
		}
		if(hasGenreBeenFound) {
			System.out.println("Dane o gatunku o id: " + id + " zosta³y usuniête...");
		} else {
			System.out.println("W bazie danych nie ma gatunku o id: " + id);
		}
		
	}
 
	public List<Book> selectByGenreBook(GenreOfBook name) {
		
		List<Book> booksSameGenre = new ArrayList<Book>();
		
		for(Genre genre : genres) {
			if(genre.getName().equals(name)) {
				booksSameGenre.addAll(genre.getBooks());
				break;
			}
		}
		return booksSameGenre;
	}

}
