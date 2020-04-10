package ru.itis.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.course.dto.UserDto;
import ru.itis.course.models.Technique;
import ru.itis.course.services.TechniqueService;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private TechniqueService techniqueService;

    @GetMapping("/main/{page}")
    public ModelAndView signUp(@PathVariable() Integer page) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        switch (page) {
            case (1):
                modelAndView.addObject("techniques", techniqueService.findAllByCategory("Подъемная"));
                break;
            case (2):
                modelAndView.addObject("techniques", techniqueService.findAllByCategory("Дорожная"));
                break;
            case (3):
                modelAndView.addObject("techniques", techniqueService.findAllByCategory("Транспортная"));
                break;
            case (4):
                modelAndView.addObject("techniques", techniqueService.findAllByCategory("Землеройная"));
                break;
        }
        return modelAndView;
    }

}
