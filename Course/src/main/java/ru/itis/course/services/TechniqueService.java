package ru.itis.course.services;

import ru.itis.course.models.Technique;

import java.util.List;

public interface TechniqueService {
    List<Technique> findAllByCategory(String category);
    Technique findById(Long id);
}
