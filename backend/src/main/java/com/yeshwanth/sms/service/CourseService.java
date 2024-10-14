package com.yeshwanth.sms.service;

import com.yeshwanth.sms.entity.CourseRegistration;
import com.yeshwanth.sms.repository.CourseRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRegistrationRepository courseRegistrationRepository;

    public List<CourseRegistration> getAllCourses() {
        return courseRegistrationRepository.findAll();
    }

    public CourseRegistration saveCourse(CourseRegistration courseRegistration) {
        return courseRegistrationRepository.save(courseRegistration);
    }

    public void deleteCourse(Long id) {
        courseRegistrationRepository.deleteById(id);
    }
}
