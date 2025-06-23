package ait.cohort5860.student.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    /*
    "id": 1000,
    "name": "Peter",
    "scores": {
        "Math": 95
    }
     */
    private Long id;
    private String name;
    private Map<String, Integer> scores;

}
