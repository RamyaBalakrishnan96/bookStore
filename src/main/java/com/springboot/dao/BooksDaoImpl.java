package com.springboot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springboot.dao.BooksDao;
import com.springboot.model.Books;

@Repository
public class BooksDaoImpl extends JdbcDaoSupport implements BooksDao {

	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public List<Books> getAllBooks() {
		String sql = "SELECT * FROM books";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

		List<Books> result = new ArrayList<Books>();
		for (Map<String, Object> row : rows) {
			Books book = new Books();
			book.setBookId((String) row.get("bookId"));
			book.setBookName((String) row.get("bookName"));
			book.setPrice((String) row.get("price"));
			result.add(book);
		}

		return result;
	}

	@Override
	public void insertBook(Books book) {
		String sql = "INSERT INTO books " +
				"(bookId, bookName, price) VALUES (?, ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				book.getBookId(), book.getBookName(), book.getPrice()
		});
		
	}
}