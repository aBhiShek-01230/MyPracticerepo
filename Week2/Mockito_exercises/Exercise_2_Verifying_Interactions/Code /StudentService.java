package com.example;

public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public void register(String name) {
        // Logic before saving
        if (name != null && !name.isEmpty()) {
            repo.saveStudent(name);
        }
    }
}
