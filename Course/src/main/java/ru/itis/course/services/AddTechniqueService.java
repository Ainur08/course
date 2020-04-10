package ru.itis.course.services;

import ru.itis.course.models.User;

public interface AddTechniqueService {
    void addTechnique(User user, String name, String date, String category, String description);
}
