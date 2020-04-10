package ru.itis.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.course.dto.UserDto;
import ru.itis.course.services.SignUpService;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String signUp() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserDto userDto) {
        signUpService.signUp(userDto.getEmail(), userDto.getPassword(), userDto.getName());
        return "redirect:/main";
    }
}
