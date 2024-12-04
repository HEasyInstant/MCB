// src/main/java/com/example/demo/entity/Student.java
package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private Set<Mark> marks;

    // Getters and Setters
}
