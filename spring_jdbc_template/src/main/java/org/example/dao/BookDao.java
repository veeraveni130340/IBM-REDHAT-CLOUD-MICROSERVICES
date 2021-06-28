package org.example.dao;
import java.sql.SQLException;
import java.util.List;

import java.io.IOException;
import java.util.List;

import org.example.BookNotFoundException;
import org.example.model.Book;

public interface BookDao {

	public Book createBook(Book book);
//	public Connection getMyConnection() throws SQLException;

	public List<Book> displayAllBook();

	public List<Book> findBookById(int id);

	public Book updateBookById(int id) throws BookNotFoundException, NumberFormatException, IOException;

	public void deleteBook(int id) throws BookNotFoundException;

}