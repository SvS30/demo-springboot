package com.progravita.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progravita.demo.dto.CourseDTO;
import com.progravita.demo.entity.Course;
import com.progravita.demo.mapper.CourseMapper;
import com.progravita.demo.repository.ICourseRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseService {
    @Autowired
    private final ICourseRepository courseRepository;

    private boolean verifyExist(Long courseId) {
        courseRepository.findById(courseId)
                .orElseThrow(()-> new ResourceNotFoundException("User is not exists with given id: "+userId);
    }

    public List<CourseDTO> getAll() {
        return courseRepository.findAll().stream()
            .map(CourseMapper::toDto).collect(Collectors.toList());
    }

    public CourseDTO getById(Long courseId) {
        Course course = courseRepository.findById(courseId).get();
        return CourseMapper.toDto(course);
    }

    public CourseDTO create(CourseDTO courseDTO) {
        Course course = CourseMapper.toEntity(courseDTO);
        Course courseSaved = courseRepository.save(course);
        return CourseMapper.toDto(courseSaved);
    }

    public void update(CourseDTO courseDTO) { return; }

    public void delete(Long courseId) {

    }
}
