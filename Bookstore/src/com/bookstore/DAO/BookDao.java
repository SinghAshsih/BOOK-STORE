package com.bookstore.DAO;

import java.sql.SQLException;

import com.bookstore.modal.Book;

public interface BookDao {
	public boolean insertBook(Book book) throws SQLException;
}
