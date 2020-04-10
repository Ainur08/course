package ru.itis.course.repositories;

import ru.itis.course.models.Technique;

import java.util.List;

public interface TechniqueRepository extends CrudRepository<Long, Technique> {
    List<Technique> findAllByCategory(String category);
}
