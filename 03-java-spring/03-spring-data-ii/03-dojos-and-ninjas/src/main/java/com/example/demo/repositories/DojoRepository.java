package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{

}
