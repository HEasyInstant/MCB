// src/main/java/com/example/demo/entity/Teacher.java
package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private Set<Student> students;

    // Getters and Setters
}
