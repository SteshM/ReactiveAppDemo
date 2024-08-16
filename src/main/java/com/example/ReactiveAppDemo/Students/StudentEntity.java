package com.example.ReactiveAppDemo.Students;

import lombok.*;
import org.springframework.data.relational.core.mapping.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Students")
public class StudentEntity {
    private long id;
    private String firstName;
    private String lastName;
    private long age;
}
