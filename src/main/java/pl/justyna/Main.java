package pl.justyna;

import java.util.List;

import pl.justyna.controller.BookController;
import pl.justyna.controller.GenreController;
import pl.justyna.model.Book;
import pl.justyna.model.Genre;
import pl.justyna.model.GenreOfBook;

public class Main {

	public static void main(String[] args) {
		System.out.println("SPIS KSI¥¯EK");
		System.out.println(" ");
		
		BookController bookController = new BookController();
		
		List<Book> books = bookController.getAll();
		
		for(Book book : books) {
			System.out.println(book);
		}
		
		System.out.println(" ");
		System.out.println("Wyœwietla ksi¹¿kê po ID");
		
		Book book = bookController.getById(10);
		System.out.println(book);
		
		System.out.println(" ");
		System.out.println("Dodawanie nowej ksi¹¿ki do biblioteki");
		
		Book newBook = new Book();
		
		newBook.setName("Mitologia Nordycka");
		newBook.setAuthor("Gaiman Neil");
		newBook.setYearOfPublishment(2017);
		
		String bookGenre = "Fantasy";
		
		bookController.register(newBook, bookGenre);
		
		System.out.println("");
		System.out.println("wyœwietla znowu wszystkie ksi¹zki wraz z now¹");
		
		for(Book bookWithNew : books) {
			System.out.println(bookWithNew);
		}
		
		System.out.println("Wyœwietlenie spisu ksi¹¿ek wraz z now¹ ksi¹¿k¹");
		for(Book book2 : bookController.getAll()) {
			System.out.println(book2);
		}
		
		bookController.updateById(newBook);
		
		System.out.println(" ");
		System.out.println("Usuwanie ksi¹zki po ID");
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
		System.out.println("Wyœwietle gatunek po jego ID");
		
		Genre genre = genreController.getById(4);
		System.out.println(genre);
		
		System.out.println(" ");
		System.out.println("Wyœwietla ksi¹¿ki tego samego gatunku");
		
		List<Book> booksSelectedByGenreName = genreController.selectByGenreBook(GenreOfBook.Horror);
		for(Book bookSelectedByGenreName : booksSelectedByGenreName) {
			System.out.println(bookSelectedByGenreName);
		}

	}

}
