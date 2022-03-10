package com.lavorwebtokens.controller;

import com.lavorwebtokens.model.Course;
import com.lavorwebtokens.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @CrossOrigin("*")
    @GetMapping("/api/courses")
    public List<Course> all() {
        return courseService.all();
    }

    @PostMapping("/api/courses")
    public void save(@RequestBody Course course){
        courseService.save(course);
    }

    @DeleteMapping("api/courses/{courseId}")
    public void delete(@PathVariable("courseId") String courseId){
        courseService.delete(courseId);
    }
}
