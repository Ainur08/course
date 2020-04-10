package ru.itis.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.course.services.TechniqueService;

@Controller
public class TechniquesController {
    @Autowired
    private TechniqueService techniqueService;

    @GetMapping("/techniques/{id}")
    public ModelAndView getTechnique(@PathVariable() Long id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("techniques");
        modelAndView.addObject("technique", techniqueService.findById(id));
        return modelAndView;
    }

    @PostMapping("/techniques/{id}")
    public String toRespond(@PathVariable() Long id) {
        return "";
    }
}

