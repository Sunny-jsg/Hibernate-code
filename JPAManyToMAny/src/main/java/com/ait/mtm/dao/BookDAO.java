package com.ait.mtm.dao;

import com.ait.mtm.entities.Book;

public interface BookDAO {
void saveBooks(Book books);
  Book findBook(Integer BookId);
  void removeBook(Integer BookId);
}
