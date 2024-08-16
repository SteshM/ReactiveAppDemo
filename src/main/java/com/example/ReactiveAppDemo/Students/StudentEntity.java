package com.example.ReactiveAppDemo.Students;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "students")
public class StudentEntity {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}
