package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.BooksDao;
import com.springboot.model.Books;
import com.springboot.service.BookStoreService;

@Service
public class BookStoreServiceImpl implements BookStoreService {

	@Autowired
	BooksDao bookDao;

	public List<Books> getAllBooks() {
		List<Books> employees = bookDao.getAllBooks();
		return employees;
	}

	@Override
	public void insertBook(Books book) {
		bookDao.insertBook(book);
		
	}

}