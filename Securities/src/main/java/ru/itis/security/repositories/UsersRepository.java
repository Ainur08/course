package ru.itis.security.repositories;

import ru.itis.security.models.User;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<Long, User> {
    Optional<User> findByEmail(String email);
}
