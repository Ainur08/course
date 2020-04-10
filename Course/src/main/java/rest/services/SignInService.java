package rest.services;

import rest.dto.SignInDto;
import rest.dto.TokenDto;

public interface SignInService {
    TokenDto signIn(SignInDto signInData);
}