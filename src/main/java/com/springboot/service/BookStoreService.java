package com.springboot.service;

import java.util.List;

import com.springboot.model.Books;

public interface BookStoreService {
	List<Books> getAllBooks();
	void insertBook(Books book);
}