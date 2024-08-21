package com.example.ReactiveAppDemo.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Mono;

import java.util.List;

public interface StudentRepo extends  JpaRepository<StudentEntity,Integer> {
    List<StudentEntity> findAllByFirstNameIgnoreCase(String firstName);

//    Mono<StudentEntity> findByStudentId(int id);
}
