package ru.itis.course.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TechniqueDto {
    private Long id;
    private String name;
    private String category;
    private String description;
}
