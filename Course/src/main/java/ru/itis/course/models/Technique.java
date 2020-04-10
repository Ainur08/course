package ru.itis.course.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "technique")
public class Technique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String date;
    private String category;
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @ToString.Exclude
    @Setter
    private User user;
}
