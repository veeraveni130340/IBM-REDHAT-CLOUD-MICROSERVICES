package com.example.demo.service;

import java.util.Collection;

import com.example.demo.model.Book;

public interface BookService {
	public Collection<Book> displayAllBook();

	public Book createBook(Book book);

	public Book findById(Integer id);

}
