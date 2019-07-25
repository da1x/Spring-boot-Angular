package com.demo.springbootangular.repositories;

import com.demo.springbootangular.entites.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
