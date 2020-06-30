package main;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;

import test.Book;

public class Basket {

	List<Book> bookList = new ArrayList<Book>();
	
	public List<Book> getBooksInBasket() {
		// TODO Auto-generated method stub
		
		return bookList;
	}
	private Matcher is(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Book> addBook(Book myBook) {
		// TODO Auto-generated method stub
		 Book book1 = new Book();		
		    bookList.add(book1);
		    return bookList;
	}
	public List<Book> addBook(Book myBook, Book hisBook) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		Book book2 = new Book();
		bookList.add(book1);
		bookList.add(book2);
		return bookList;
	}
	
}
