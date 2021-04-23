package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}
