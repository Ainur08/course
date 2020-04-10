package ru.itis.security.repositories;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<ID, T> {
    void save(T entity);
    void update(T entity);
    void delete(ID id);
    Optional<T> findById(ID id);

    List<T> findAll();
}
