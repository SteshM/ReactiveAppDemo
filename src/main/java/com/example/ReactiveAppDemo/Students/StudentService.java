package com.example.ReactiveAppDemo.Students;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo repo;

    public Mono<StudentEntity>save(StudentEntity student){
        repo.save(student);
        return null;
    }

    public Flux<StudentEntity>findAll(){
        repo.findAll();
        return null;

    }
    public Mono<StudentEntity> findById(int id){
        return repo.findByStudentId(id);
    }


}
