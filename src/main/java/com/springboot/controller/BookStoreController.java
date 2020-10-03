package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Books;
import com.springboot.service.BookStoreService;

@RestController
public class BookStoreController {

	@Autowired
	BookStoreService bookStoreService;

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Books> getBooks() {

		return bookStoreService.getAllBooks();

	}
	
	@RequestMapping(value = "/insertbook", method = RequestMethod.POST)
	public void insertEmployee(@RequestBody Books book) {
		bookStoreService.insertBook(book);
	}

}
