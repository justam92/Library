package pl.justyna.daoMock;

import java.util.ArrayList;
import java.util.List;

import pl.justyna.dao.BookDao;
import pl.justyna.model.Book;
import pl.justyna.model.GenreOfBook;

public class BookDaoMock implements BookDao {
	
	private List<Book> books = new ArrayList<Book>();
	
	public BookDaoMock() {
		
		Book book1 = new Book();
		book1.setId(1);
		book1.setName("Wodecki. Tak mi wysz³o");
		book1.setAuthor("Ba³uk Kamil, Krupiñski Wac³aw");
		book1.setGenreOfBook(GenreOfBook.Biografia);
		book1.setYearOfPublishment(2018);
		
		books.add(book1);
		
		Book book2 = new Book();
		book2.setId(2);
		book2.setName("Kuba Wojewódzki. Nieautoryzowana autobiografia");
		book2.setAuthor("Wojewódzki Kuba");
		book2.setGenreOfBook(GenreOfBook.Biografia);
		book2.setYearOfPublishment(2018);
		
		books.add(book2);
		
		Book book3 = new Book();
		book3.setId(3);
		book3.setName("Czerwone krzes³o. Magiczne drzewo. Tom 1");
		book3.setAuthor("Maleszka Andrzej");
		book3.setGenreOfBook(GenreOfBook.DlaDzieci);
		book3.setYearOfPublishment(2015);
		
		books.add(book3);
		
		Book book4 = new Book();
		book4.setId(4);
		book4.setName("Która to Malala?");
		book4.setAuthor("Pi¹tkowska Renata");
		book4.setGenreOfBook(GenreOfBook.DlaDzieci);
		book4.setYearOfPublishment(2015);
		
		books.add(book4);
		
		Book book5 = new Book();
		book5.setId(5);
		book5.setName("Fantastyczne zwierzêta i jak je znaleŸæ. Leksykon");
		book5.setAuthor("Rowling J.K.");
		book5.setGenreOfBook(GenreOfBook.DlaM³odzie¿y);
		book5.setYearOfPublishment(2017);
		
		books.add(book5);
		
		Book book6 = new Book();
		book6.setId(6);
		book6.setName("Ksiê¿niczka Popio³u");
		book6.setAuthor("Laura Sebastian");
		book6.setGenreOfBook(GenreOfBook.DlaM³odzie¿y);
		book6.setYearOfPublishment(2018);
		
		books.add(book6);
		
		Book book7 = new Book();
		book7.setId(7);
		book7.setName("WiedŸmin. Tom 1. Ostatnie ¿yczenie");
		book7.setAuthor("Sapkowski Andrzej");
		book7.setGenreOfBook(GenreOfBook.Fantasy);
		book7.setYearOfPublishment(2014);
		
		books.add(book7);
		
		Book book8 = new Book();
		book8.setId(8);
		book8.setName("Hobbit");
		book8.setAuthor("Tolkien John Ronald Reuel");
		book8.setGenreOfBook(GenreOfBook.Fantasy);
		book8.setYearOfPublishment(2014);
		
		books.add(book8);
		
		Book book9 = new Book();
		book9.setId(9);
		book9.setName("Cmêtarz zwie¿¹t");
		book9.setAuthor("King Stephen");
		book9.setGenreOfBook(GenreOfBook.Horror);
		book9.setYearOfPublishment(2009);
		
		books.add(book9);
		
		Book book10 = new Book();
		book10.setId(10);
		book10.setName("Zew Cthulhu");
		book10.setAuthor("Lovecraft Howard Phillips");
		book10.setGenreOfBook(GenreOfBook.Horror);
		book10.setYearOfPublishment(2004);
		
		books.add(book10);
		
		Book book11 = new Book();
		book11.setId(11);
		book11.setName("Tokyo Ghoul");
		book11.setAuthor("Sui Ishida");
		book11.setGenreOfBook(GenreOfBook.Komiks);
		book11.setYearOfPublishment(2015);
		
		books.add(book11);
		
		Book book12 = new Book();
		book12.setId(12);
		book12.setName("Kajko i Kokosz. Szko³a latania.");
		book12.setAuthor("Christa Janusz");
		book12.setGenreOfBook(GenreOfBook.Komiks);
		book12.setYearOfPublishment(2011);
		
		books.add(book12);
		
		Book book13 = new Book();
		book13.setId(13);
		book13.setName("Nie odpuszczaj");
		book13.setAuthor("Coben Harlan");
		book13.setGenreOfBook(GenreOfBook.Thriller);
		book13.setYearOfPublishment(2018);
		
		books.add(book13);
		
		Book book14 = new Book();
		book14.setId(14);
		book14.setName("Czarownice nie p³on¹");
		book14.setAuthor("Blackhurst Jenny");
		book14.setGenreOfBook(GenreOfBook.Thriller);
		book14.setYearOfPublishment(2018);
		
		books.add(book14);
	}

	public List<Book> selectAll() {
		return books;
	}

	public Book selectById(Integer id) {
		for (Book book : books) {
			if(book.getId().equals(id)) {
				return book;
			}
		}
		
		throw new RuntimeException("Brak ksi¹zki o id: " + id);
	}

	public void register(Book book) {
		Integer lastId = 0;

		for (Book bookWithLastId : books) {
			lastId = Math.max(lastId, bookWithLastId.getId());
		}

		book.setId(lastId + 1);

		books.add(book);
		
	}

	public void updateById(Book book) {
		for(Book bookToUpdate : books) {
			if (bookToUpdate.getId().equals(book.getId())) {
				bookToUpdate.setName(book.getName());
				bookToUpdate.setAuthor(book.getAuthor());
				bookToUpdate.setYearOfPublishment(book.getYearOfPublishment());
				break;
			}
		}
		
	}

	public void deleteById(Integer id) {
		System.out.println(" ");
		System.out.println("USUWANIE DANYCH O KSI¥¯CE");
		System.out.println(" ");

		List<Book> books = selectAll();
		boolean hasBookBeenFound = false;

		for (Book book : books) {
			if (id == book.getId()) {
				hasBookBeenFound = true;
				books.remove(book);
				break;
			}
		}

		if (hasBookBeenFound) {
			System.out.println("Dane o ksi¹¿ce o id " + id + " zosta³y usuniête...");
		} else {
			System.out.println("W bazie danych nie ma ksi¹¿ki o id: " + id);
		}

	}
	
}
