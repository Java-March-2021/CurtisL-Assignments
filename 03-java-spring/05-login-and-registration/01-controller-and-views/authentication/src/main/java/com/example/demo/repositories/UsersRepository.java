package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findByEmail(String email);

}
