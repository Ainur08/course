package ru.itis.security.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
public class SignUpForm {
    @Email(message = "{errors.incorrect.email}")
    private String email;

    @NotEmpty(message = "{errors.incorrect.password}")
    private String password;
}
