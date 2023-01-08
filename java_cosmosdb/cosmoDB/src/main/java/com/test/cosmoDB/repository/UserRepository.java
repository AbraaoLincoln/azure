package com.test.cosmoDB.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.test.cosmoDB.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CosmosRepository<User, String> {
    Optional<User> findByName(String name);
}
