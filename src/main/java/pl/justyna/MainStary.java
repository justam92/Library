package pl.justyna;

import java.util.List;

import pl.justyna.controller.BookController;
import pl.justyna.controller.GenreController;
import pl.justyna.model.Book;
import pl.justyna.model.Genre;
import pl.justyna.model.GenreOfBook;

public class MainStary {

	public static void cycki(String[] args) {
		System.out.println("SPIS KSIĄŻEK");
		System.out.println(" ");
		
		BookController bookController = new BookController();
		
		List<Book> books = bookController.getAll();
		
		for(Book book : books) {
			System.out.println(book);
		}
		
		System.out.println(" ");
		System.out.println("Wyświetla książki po ID");
		
		Book book = bookController.getById(10);
		System.out.println(book);
		
		System.out.println(" ");
		System.out.println("Dodawanie nowej książki do biblioteki");
		
		Book newBook = new Book();
		
		newBook.setName("Mitologia Nordycka");
		newBook.setAuthor("Gaiman Neil");
		newBook.setYearOfPublishment(2017);
		
		String bookGenre = "Fantasy";
		
		bookController.register(newBook, bookGenre);
		
		System.out.println("");
		System.out.println("wyświetla znowu wszystkie książki wraz z nową");
		
		for(Book bookWithNew : books) {
			System.out.println(bookWithNew);
		}
		
		System.out.println("Wyświetlenie spisu książek wraz z nową książką");
		for(Book book2 : bookController.getAll()) {
			System.out.println(book2);
		}
		
		bookController.updateById(newBook);
		
		System.out.println(" ");
		System.out.println("Usuwanie książki po ID");
		bookController.deleteById(6);
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("GATUNKI");
		
		GenreController genreController = new GenreController();
		
		List<Genre> genres = genreController.getAll();
		
		for(Genre genre : genres) {
			System.out.println(genre);
		}
		
		System.out.println(" ");
		System.out.println("Wyświetla gatunek po jego ID");
		
		Genre genre = genreController.getById(4);
		System.out.println(genre);
		
		System.out.println(" ");
		System.out.println("Wyświetla książki tego samego gatunku");
		
		List<Book> booksSelectedByGenreName = genreController.selectByGenreBook(GenreOfBook.Horror);
		for(Book bookSelectedByGenreName : booksSelectedByGenreName) {
			System.out.println(bookSelectedByGenreName);
		}

	}

}
