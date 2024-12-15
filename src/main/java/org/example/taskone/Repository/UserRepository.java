package org.example.taskone.Repository;

import org.example.taskone.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);

    User getUserById(String id);
}

