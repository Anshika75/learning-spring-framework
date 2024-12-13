package com.springbootut.learning.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
            new Course(1, "Learn Full stack with Spring Boot and Angular", "Ranga"),
            new Course(2, "Learn Full stack with Spring Boot and React", "Ranga"),
            new Course(3, "Master Microservices with Spring Boot and Spring Cloud", "Ranga")
        );
    }
}