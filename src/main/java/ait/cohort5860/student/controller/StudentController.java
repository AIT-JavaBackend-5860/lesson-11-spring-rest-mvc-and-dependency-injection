package ait.cohort5860.student.controller;

import ait.cohort5860.student.dto.ScoreDto;
import ait.cohort5860.student.dto.StudentCredentialsDto;
import ait.cohort5860.student.dto.StudentDto;
import ait.cohort5860.student.dto.StudentUpdateDto;
import ait.cohort5860.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class StudentController{
    @Autowired
    private StudentService studentService;


    // ✅ Добавить студента
    @PostMapping("/student")
    public Boolean addStudent(@RequestBody StudentCredentialsDto studentCredentialsDto) {
        return studentService.addStudent(studentCredentialsDto);
    }

    // ✅ Найти студента по id
    @GetMapping("/student/{id}")
    public StudentDto findStudent(@PathVariable Long id) {
        return studentService.findStudent(id);
    }

    // ✅ Удалить студента по id
    @DeleteMapping("/student/{id}")
    public StudentDto removeStudent(@PathVariable Long id) {
        return studentService.removeStudent(id);
    }

    // ✅ Обновить студента по id
    @PatchMapping("/student/{id}")
    public StudentCredentialsDto updateStudent(
            @PathVariable Long id,
            @RequestBody StudentUpdateDto studentUpdateDto) {
        return studentService.updateStudent(id, studentUpdateDto);
    }

    // ✅ Добавить баллы студенту
    @PatchMapping("/score/{id}")
    public Boolean addScore(@PathVariable Long id, @RequestBody ScoreDto scoreDto) {
        return studentService.addScore(id, scoreDto);
    }

    // ✅ Найти студентов по имени
    @GetMapping("/name/{name}")
    public List<StudentDto> findAllStudents(@PathVariable String name) {
        return studentService.findAllStudents(name);
    }

    // ✅ Посчитать количество студентов по именам
    @GetMapping("/quantity")
    public Long countStudentsByNames(@RequestParam Set<String> names) {
        return studentService.countStudentsByNames(names);
    }

    // ✅ Найти студентов по предмету и минимальному баллу
    @GetMapping("/exam/{examName}/minscore/{minScore}")
    public List<StudentDto> findAllStudentsByExamNameMinScore(
            @PathVariable String examName,
            @PathVariable Integer minScore) {
        return studentService.findAllStudentsByExamNameMinScore(examName, minScore);
    }
}
