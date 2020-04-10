package ru.itis.course.repositories;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.itis.course.models.Technique;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Component
public class TechniqueJpaRepositoryImpl implements TechniqueRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Technique> findAllByCategory(String category) {
        return entityManager.createQuery("select t from Technique t WHERE t.category = :category")
                .setParameter("category", category)
                .getResultList();
    }

    @Override
    @Transactional
    public void save(Technique technique) {
        entityManager.persist(technique);
    }

    @Override
    public void update(Technique technique) {

    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    @Transactional
    public Optional<Technique> findById(Long aLong) {
        return Optional.ofNullable(entityManager.createQuery("select c from Technique c where c.id = :id", Technique.class)
                .setParameter("id", aLong)
                .getSingleResult());
    }

    @Override
    public List<Technique> findAll() {
        return null;
    }
}
