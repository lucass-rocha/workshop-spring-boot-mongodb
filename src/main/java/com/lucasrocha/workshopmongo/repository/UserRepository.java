package com.lucasrocha.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lucasrocha.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
