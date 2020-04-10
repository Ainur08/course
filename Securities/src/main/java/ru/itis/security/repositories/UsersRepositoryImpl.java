package ru.itis.security.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.itis.security.models.User;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

@Repository
public class UsersRepositoryImpl implements UsersRepository {
    private static final String SAVE = "INSERT INTO itis_user(email, password) VALUES (?, ?)";
    private static final String FIND_BY_EMAIL = "SELECT * FROM itis_user WHERE email = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private RowMapper<User> userRowMapper = (row, rowNum) ->
            User.builder()
                    .email(row.getString("email"))
                    .hashPassword(row.getString("password"))
                    .id(row.getLong("id"))
                    .build();

    @Override
    public Optional<User> findByEmail(String email) {
        User user = jdbcTemplate.queryForObject(FIND_BY_EMAIL, new Object[]{email}, userRowMapper);
        return Optional.ofNullable(user);
    }

    @Override
    public void save(User entity) {
        jdbcTemplate.update(connection -> {
            PreparedStatement statement = connection.prepareStatement(SAVE);
            statement.setString(1, entity.getEmail());
            statement.setString(2, entity.getHashPassword());
            return statement;
        });
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
