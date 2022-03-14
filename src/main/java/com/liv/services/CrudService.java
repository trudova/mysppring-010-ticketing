package com.liv.services;

import java.util.List;

public interface CrudService<T, ID> {
    List<T> findAll();

    T findById(ID id);

    void delete(T obj);

    void deleteById(ID id);

    T save(T obj);

    void update(T obj);

}
