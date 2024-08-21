package com.example.ReactiveAppDemo.Students;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table( name = "students")
//@Table(name = "students")
public class StudentEntity {
//    @Id
//

    @Id
    @JsonIgnoreProperties(ignoreUnknown = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
}
