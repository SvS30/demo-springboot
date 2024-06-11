package com.progravita.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progravita.demo.dto.CourseDTO;
import com.progravita.demo.entity.Course;
import com.progravita.demo.exception.BodyInvalid;
import com.progravita.demo.exception.SourceNotFound;
import com.progravita.demo.mapper.CourseMapper;
import com.progravita.demo.repository.ICourseRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CourseService {

    private Course verifyExist(Long courseId) {
        return courseRepository.findById(courseId)
            .orElseThrow(() -> new SourceNotFound("Course not found with id: " + courseId));
    }

    @Autowired
    private final ICourseRepository courseRepository;

    public List<CourseDTO> getAll() {
        return courseRepository.findAll().stream()
            .map(CourseMapper::toDto).collect(Collectors.toList());
    }

    public CourseDTO getById(Long courseId) {
        Course course = verifyExist(courseId);
        return CourseMapper.toDto(course);
    }

    public CourseDTO create(CourseDTO courseDTO) {
        Course course = CourseMapper.toEntity(courseDTO);
        Course courseSaved = courseRepository.save(course);
        return CourseMapper.toDto(courseSaved);
    }

    public void update(CourseDTO courseDTO) {
        if (courseDTO.getId() == null) throw new BodyInvalid("Course ID must be provided for update");
        Course course = verifyExist(courseDTO.getId());
        course.setTitle(courseDTO.getTitle());
        course.setDescription(courseDTO.getDescription());
        course.setPrice(courseDTO.getPrice());
        course.setCategory(courseDTO.getCategory());
        courseRepository.save(course);
    }

    public void delete(Long courseId) {
        Course course = verifyExist(courseId);
        courseRepository.delete(course);
    }
}
