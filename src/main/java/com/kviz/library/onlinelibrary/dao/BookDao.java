package com.kviz.library.onlinelibrary.dao;

import com.kviz.library.onlinelibrary.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDAO<Book> {

    List<Book> findTopBooks(int limit);
}
