package ru.itis.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.security.dto.SignUpForm;
import ru.itis.security.dto.UserDto;
import ru.itis.security.services.SignUpService;

import javax.validation.Valid;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUp")
    public String signUp() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public ModelAndView signUp(@Valid SignUpForm signUpForm) {
        ModelAndView modelAndView = new ModelAndView();
        signUpService.signUp(signUpForm.getEmail(), signUpForm.getPassword());
        modelAndView.addObject("signUpForm", signUpForm);
        return modelAndView;
    }
}
