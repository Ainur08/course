package ru.itis.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.course.models.Technique;
import ru.itis.course.repositories.TechniqueRepository;

import java.util.List;

@Service
public class TechniqueServiceImpl implements TechniqueService {
    @Autowired
    private TechniqueRepository techniqueRepository;

    @Override
    public List<Technique> findAllByCategory(String category) {
        return techniqueRepository.findAllByCategory(category);
    }

    @Override
    public Technique findById(Long id) {
        return techniqueRepository.findById(id).get();
    }
}
