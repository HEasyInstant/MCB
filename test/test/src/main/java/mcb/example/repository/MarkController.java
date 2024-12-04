// src/main/java/com/example/demo/controller/MarkController.java
package com.example.demo.controller;

import com.example.demo.entity.Mark;
import com.example.demo.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marks")
public class MarkController {

    @Autowired
    private MarkService markService;

    @GetMapping("/student/{studentId}")
    public List<Mark> getMarksByStudent(@PathVariable Long studentId) {
        return markService.findByStudentId(studentId);
    }

    @GetMapping("/teacher/{teacherId}")
    public List<Mark> getMarksByTeacher(@PathVariable Long teacherId) {
        return markService.findByTeacherId(teacherId);
    }
}
