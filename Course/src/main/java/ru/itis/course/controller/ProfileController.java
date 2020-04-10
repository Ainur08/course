package ru.itis.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.course.repositories.UsersRepository;
import ru.itis.course.security.details.UserDetailsImpl;

@Controller
public class ProfileController {
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/profile")
    public ModelAndView login() {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", usersRepository.findById(userDetails.getUser().getId()).get());
        return modelAndView;
    }
}
