package ru.itis.course.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.itis.course.models.User;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Optional;

@Repository
public class UsersJdbcTemplateRepositoryImpl implements UsersRepository {
    private static final String FIND_BY_ID = "SELECT * FROM itis_user WHERE id = ?";
    private static final String SAVE = "INSERT INTO itis_user(email, name, password) VALUES (?, ?, ?)";
    private static final String FIND_BY_EMAIL = "SELECT * FROM itis_user WHERE email = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private RowMapper<User> userRowMapper = (row, rowNum) ->
            User.builder()
                    .name(row.getString("name"))
                    .email(row.getString("email"))
                    .password(row.getString("password"))
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
            statement.setString(2, entity.getName());
            statement.setString(3, entity.getPassword());
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
        User user = jdbcTemplate.queryForObject(FIND_BY_ID, new Object[]{aLong}, userRowMapper);
        return Optional.of(user);
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
