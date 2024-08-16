package com.example.ReactiveAppDemo.Students;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}
