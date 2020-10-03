package com.springboot.dao;

import java.util.List;

import com.springboot.model.Books;

public interface BooksDao {
	List<Books> getAllBooks();

	void insertBook(Books book);
}