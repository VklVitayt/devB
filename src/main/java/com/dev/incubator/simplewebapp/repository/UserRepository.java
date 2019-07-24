package com.dev.incubator.simplewebapp.repository;

import com.dev.incubator.simplewebapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByIdUser(Long id);

}