package ru.itis.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itis.security.models.User;
import ru.itis.security.repositories.UsersRepository;

@Service
public class SignUpServiceImpl implements SignUpService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    private User user;

    @Override
    public void signUp(String email, String password) {
        user = User.builder()
                .email(email)
                .hashPassword(passwordEncoder.encode(password))
                .build();
        usersRepository.save(user);
    }
}
