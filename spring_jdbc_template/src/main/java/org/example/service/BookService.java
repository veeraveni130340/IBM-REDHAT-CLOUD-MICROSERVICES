package org.example.service;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.example.BookNotFoundException;
import org.example.model.Book;

public interface BookService {
	public Book createBook(Book book) throws SQLException;
	public List<Book> displayAllBook() throws SQLException;
	public List<Book> findBookById(Integer id)throws SQLException;
	public Book updateBookById(int id) throws BookNotFoundException, NumberFormatException, IOException;
	public void deleteBook(int id) throws BookNotFoundException;
}