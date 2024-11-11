package com.cruddemo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.cruddemo.entity.student;

public interface StudentRepository<T> extends CrudRepository<student, Integer> {

}
