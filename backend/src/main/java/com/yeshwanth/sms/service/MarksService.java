package com.yeshwanth.sms.service;

import com.yeshwanth.sms.entity.Marks;
import com.yeshwanth.sms.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarksService {
    @Autowired
    private MarksRepository marksRepository;

    public List<Marks> getAllMarks() {
        return marksRepository.findAll();
    }

    public Marks saveMarks(Marks marks) {
        return marksRepository.save(marks);
    }

    public void deleteMarks(Long id) {
        marksRepository.deleteById(id);
    }
}
