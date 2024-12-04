// src/main/java/com/example/demo/service/MarkService.java
package com.example.demo.service;

import com.example.demo.entity.Mark;
import com.example.demo.repository.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarkService {
    @Autowired
    private MarkRepository markRepository;

    public List<Mark> findByStudentId(Long studentId) {
        return markRepository.findByStudentId(studentId);
    }

    public List<Mark> findByTeacherId(Long teacherId) {
        return markRepository.findByTeacherId(teacherId);
    }
}
