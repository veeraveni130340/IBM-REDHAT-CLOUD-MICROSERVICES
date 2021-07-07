package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {
	public Book createBook(Book book);
	public List<Book> getAllBook();
	public Book getBookById(Integer id);
	public Book getByBookId(String id);
	public Book updateBookByBookId(String bookId,Book book);
	public String deleteByBookId(String bookId);
}