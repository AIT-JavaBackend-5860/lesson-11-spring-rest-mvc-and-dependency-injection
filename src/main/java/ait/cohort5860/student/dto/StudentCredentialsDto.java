package ait.cohort5860.student.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


    /*
     "id": 1000,
	"name": "Peter",
	"password": "1234"
     */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentCredentialsDto {
    private Long id;
    private String name;
    private String password;
}
