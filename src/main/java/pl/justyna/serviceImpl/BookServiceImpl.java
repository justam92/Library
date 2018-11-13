package pl.justyna.serviceImpl;

import java.util.List;

import pl.justyna.dao.BookDao;
import pl.justyna.daoMock.BookDaoMock;
import pl.justyna.model.Book;
import pl.justyna.model.GenreOfBook;
import pl.justyna.service.BookService;
import pl.justyna.service.GenreService;

public class BookServiceImpl implements BookService {

	private BookDao bookDao = new BookDaoMock();
	
	private GenreService genreService = new GenreServiceImpl();

	public List<Book> selectAll() {
		return bookDao.selectAll();
	}

	public Book selectById(Integer id) {
		return bookDao.selectById(id);
	}

	public void register(Book book, String bookGenre) {

		GenreOfBook targetGenre = genreService.searchByGenreName(bookGenre);

		if (targetGenre != null) {
			book.setGenreOfBook(targetGenre);
			bookDao.register(book);
		}
	}

	public void deleteById(Integer id) {
		bookDao.deleteById(id);
	}

	public void updateById(Book book) {
		bookDao.updateById(book);

	}

}
