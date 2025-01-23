package com.ait.mtm.test;

import java.util.Arrays;
import java.util.List;

import com.ait.mtm.dao.BookDAO;
import com.ait.mtm.dao.impl.BookDAOImpl;
import com.ait.mtm.entities.Author;
import com.ait.mtm.entities.Book;

public class Tester {
	public static void main(String[] args) {
		BookDAO dao = new BookDAOImpl();
		/*
		 * create book instances
		 */
		/*
		 * Book b1 = new Book(); b1.setBookId(11111); b1.setBookName("Learn Java"); Book
		 * b2 =new Book(); b2.setBookId(11112); b2.setBookName("Learn HTML,CSS");
		 */
		/*
		 * create authors instance
		 */
		/*
		 * Author a1 = new Author(); a1.setAuthorId(1001); a1.setAuthorName("Garden");
		 * Author a2 = new Author(); a2.setAuthorId(1002); a2.setAuthorName("John");
		 * Author a3 = new Author(); a3.setAuthorId(1003);
		 * a3.setAuthorName("James Clear"); List<Author> list_of_author_of_book1
		 * =Arrays.asList(a1,a3); b1.setAuthors(list_of_author_of_book1); List<Author>
		 * list_of_author_of_book2 =Arrays.asList(a2,a3,a1);
		 * b2.setAuthors(list_of_author_of_book2); dao.saveBooks(b1); dao.saveBooks(b2);
		 */
		/*
		 * find the book
		 */
		/*Book book_from_db = dao.findBook(11112);
		System.out.println("Book Id :: " + book_from_db.getBookId());
		System.out.println("Book Name ::" + book_from_db.getBookName());
		List<Author> authors = book_from_db.getAuthors();
		authors.forEach(System.out::println);*/
		/*
		 * remove the book
		 */
		dao.removeBook(11112);

	}

}
