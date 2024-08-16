package com.example.ReactiveAppDemo.Students;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepo repo;

    public HttpStatus findAll(){
        repo.findAll();
        return HttpStatus.OK;

    }
}
