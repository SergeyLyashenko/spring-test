package com.slyashenko.dao;

import java.util.List;

/**
 * Created by Kate on 06.05.17.
 */
public interface GenericDao<T> {

    T create(T t);
    T read(Class<T> t, Long id);
    T update(T t);
    T delete(T t);
    List<T> readAll(Class<T> t);
}
