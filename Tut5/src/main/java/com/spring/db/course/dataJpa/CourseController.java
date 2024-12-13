package com.spring.db.course.dataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository repo;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseDetails(@PathVariable long id) {
        Optional<Course> course = repo.findById(id);
        if(course.isEmpty()){
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course){
        repo.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id){
        repo.deleteById(id);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course){
        repo.save(course);
    }


}
