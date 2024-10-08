package com.example.ReactiveAppDemo.Students;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepo studentRepo;
    private final StudentService studentService;

    @PostMapping()
    Mono<StudentEntity> saveStudent(@RequestBody StudentEntity student){
        return studentService.save(student);
    }
    @GetMapping()
    Flux<StudentEntity>allStudents(){
        return studentService.findAll();
    }

}
