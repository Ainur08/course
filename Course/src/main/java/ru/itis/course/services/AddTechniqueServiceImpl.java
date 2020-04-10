package ru.itis.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.course.models.Technique;
import ru.itis.course.models.User;
import ru.itis.course.repositories.TechniqueRepository;

@Service
public class AddTechniqueServiceImpl implements AddTechniqueService {
    @Autowired
    private TechniqueRepository techniqueRepository;

    @Override
    public void addTechnique(User user, String name, String date, String category, String description) {
        techniqueRepository.save(Technique.builder()
                .user(user)
                .name(name)
                .date(date)
                .category(category)
                .description(description)
                .build());
    }
}
