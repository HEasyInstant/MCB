// src/test/java/com/example/demo/MarkControllerTest.java
package com.example.demo;

import com.example.demo.controller.MarkController;
import com.example.demo.service.MarkService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

@SpringBootTest
class MarkControllerTest {

    @Mock
    private MarkService markService;

    private MarkController markController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        markController = new MarkController(markService);
    }

    @Test
    void testGetMarksByStudent() {
        // Test logic here
    }

    @Test
    void testGetMarksByTeacher() {
        // Test logic here
    }
}
