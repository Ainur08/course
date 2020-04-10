//package ru.itis.course.repositories;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//import ru.itis.course.models.User;
//
//import java.sql.PreparedStatement;
//import java.util.Optional;
//
//@Component
//public class UsersRepositoryImpl implements UsersRepository {
//    private static final String SAVE = "INSERT INTO itis_user(name, email, password, token) VALUES (?, ?, ?, ?)";
//    private static final String FIND_BY_TOKEN = "SELECT * FROM itis_user WHERE token = ?";
//    private static final String UPDATE_CONFIRMATION = "UPDATE itis_user SET is_confirmed = ? WHERE id = ?";
//    private static final String FIND_BY_EMAIL = "SELECT (id, email, password) FROM itis_user WHERE email = ?";
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//
//    private RowMapper<User> userRowMapper = (row, rowNum) ->
//            User.builder()
//                    .name(row.getString("name"))
//                    .email(row.getString("email"))
//                    .token(row.getString("token"))
//                    .isConfirmed(row.getBoolean("is_confirmed"))
//                    .id(row.getLong("id"))
//                    .build();
//
//
//    @Override
//    public Optional<User> findByToken(String token) {
//        User user = jdbcTemplate.queryForObject(FIND_BY_TOKEN, new Object[]{token}, userRowMapper);
//        return Optional.ofNullable(user);
//    }
//
//    @Override
//    public void updateConfirmation(User user) {
//        jdbcTemplate.update(connection -> {
//            PreparedStatement statement = connection.prepareStatement(UPDATE_CONFIRMATION);
//            statement.setBoolean(1, user.isConfirmed());
//            statement.setLong(2, user.getId());
//            return statement;
//        });
//    }
//
//    @Override
//    public Optional<User> findByEmail(String email) {
//        User user = jdbcTemplate.queryForObject(FIND_BY_EMAIL, new Object[]{email}, userRowMapper);
//        return Optional.ofNullable(user);
//    }
//
//    @Override
//    public void save(User entity) {
//        jdbcTemplate.update(connection -> {
//            PreparedStatement statement = connection.prepareStatement(SAVE);
//            statement.setString(1, entity.getName());
//            statement.setString(2, entity.getEmail());
//            statement.setString(3, entity.getPassword());
//            statement.setString(4, entity.getToken());
//            return statement;
//        });
//    }
//
//    @Override
//    public void update(User entity) {
//
//    }
//
//    @Override
//    public void delete(Long aLong) {
//
//    }
//
//    @Override
//    public Optional<User> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public List<User> findAll() {
//        return null;
//    }
//}
