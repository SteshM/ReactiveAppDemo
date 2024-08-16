package com.example.ReactiveAppDemo.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import reactor.core.publisher.Flux;

public interface StudentRepo extends  JpaRepository<StudentEntity,Integer> {
    Flux<StudentEntity>findAllByFirstNameIgnoreCase(String firstName);
}
