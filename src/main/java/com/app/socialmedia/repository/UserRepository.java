package com.app.socialmedia.repository;

import java.util.Optional;

import com.app.socialmedia.entity.UserEntity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {

    Optional<UserEntity> findByEmail(String email);
    
}
