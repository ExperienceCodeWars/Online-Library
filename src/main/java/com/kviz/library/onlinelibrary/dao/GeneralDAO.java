package com.kviz.library.onlinelibrary.dao;

import java.util.List;

public interface GeneralDAO<T> {
    List<T> getAll();

    List<T> search(String... searchString);

    T get(long id);

    T save(T obj);

    void delete(T obj);
}