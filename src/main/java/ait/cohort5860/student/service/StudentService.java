package ait.cohort5860.student.service;

import ait.cohort5860.student.dto.ScoreDto;
import ait.cohort5860.student.dto.StudentCredentialsDto;
import ait.cohort5860.student.dto.StudentDto;
import ait.cohort5860.student.dto.StudentUpdateDto;

import java.util.List;
import java.util.Set;

public interface StudentService {

    // Add new student (POST /student)
    Boolean addStudent(StudentCredentialsDto studentCredentialsDtoDtoDto);

    // Get student by ID (GET /student/{id})
    StudentDto findStudent(Long id);

    // Delete student by ID (DELETE /student/{id})
    StudentDto removeStudent(Long id);

    // Update student data (PATCH /student/{id})
    StudentCredentialsDto updateStudent(Long id, StudentUpdateDto studentUpdateDto);

    // Add score for student (PATCH /score/student/{id})
    Boolean addScore(Long id, ScoreDto scoreDtoDto);

    // Find all students by name (GET /students/name/{name})
    List<StudentDto> findAllStudents(String name);

    // Count students by names (GET /quantity/students?names=...)
    Long countStudentsByNames(Set<String> names);

    // Find students by exam + min score (GET /students/exam/{exam}/minscore/{minScore})
    List<StudentDto> findAllStudentsByExamNameMinScore(String examName, Integer minScore);




}
