package com.yeshwanth.sms.controller;

import com.yeshwanth.sms.entity.CourseRegistration;
import com.yeshwanth.sms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<CourseRegistration> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public CourseRegistration createCourse(@RequestBody CourseRegistration courseRegistration) {
        return courseService.saveCourse(courseRegistration);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return ResponseEntity.noContent().build();
    }
}
