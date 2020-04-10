package ru.itis.course.repositories;

import ru.itis.course.models.User;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<Long, User> {
//    Optional<User> findByToken(String token);
//    void updateConfirmation(User user);
    Optional<User> findByEmail(String email);
}
