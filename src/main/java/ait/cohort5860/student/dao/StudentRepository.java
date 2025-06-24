package ait.cohort5860.student.dao;

import ait.cohort5860.student.model.Student;
import io.micrometer.common.KeyValues;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    //List<Student> findByNameIgnoreCase(String name);



    Student save(Student student);

    Optional<Student> findById(Long id);

    void deleteById(Long id);

    List<Student> findAll();

}
