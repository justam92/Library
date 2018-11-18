package pl.justyna.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.justyna.dao.GenreDao;
import pl.justyna.daoMock.GenreDaoMock;
import pl.justyna.model.Book;
import pl.justyna.model.Genre;
import pl.justyna.model.GenreOfBook;
import pl.justyna.service.GenreService;

@Service
public class GenreServiceImpl implements GenreService {
	
	private GenreDao genreDao = new GenreDaoMock();

	public List<Genre> selectAll() {
		return genreDao.selectAll();
	}

	public Genre selectById(Integer id) {
		return genreDao.selectById(id);
	}

	public List<Book> selectByGenreBook(GenreOfBook nameGenre) {
		return genreDao.selectByGenreBook(nameGenre);
	}

	public void deleteById(Integer id) {
		genreDao.deleteById(id);
	}
	
	public GenreOfBook searchByGenreName(String bookGenre) {
		boolean hasTheSameGenreNameBeenFound = false;
		GenreOfBook foundGenre = null;

		for (GenreOfBook genre : GenreOfBook.values()) {
			if (genre.name().equalsIgnoreCase(bookGenre)) {
				hasTheSameGenreNameBeenFound = true;
				foundGenre = genre;
				break;
			}
		}

		if (hasTheSameGenreNameBeenFound) {
			System.out.println("Do bazy danych dodano książke gatunku: " + bookGenre);
		} else {
			System.out.println("W bazie danych nie ma gatunku o nazwie: " + bookGenre);
		}

		return foundGenre;
	}

}
