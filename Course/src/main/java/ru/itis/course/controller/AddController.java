package ru.itis.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.course.dto.TechniqueDto;
import ru.itis.course.security.details.UserDetailsImpl;
import ru.itis.course.services.AddTechniqueService;

import java.util.Date;

@Controller
public class AddController {
    @Autowired
    private AddTechniqueService addTechniqueService;

    @GetMapping("/add")
    public String login() {
        return "add";
    }

    @PostMapping("/add")
    public String addTechnique(TechniqueDto techniqueDto) {
        UserDetailsImpl userDetails = (UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        addTechniqueService.addTechnique(userDetails.getUser(), techniqueDto.getName(),
                new Date().toString(),
                techniqueDto.getCategory(),
                techniqueDto.getDescription()
        );
        return "redirect:/main/4";
    }
}
