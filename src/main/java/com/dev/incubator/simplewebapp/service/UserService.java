package com.dev.incubator.simplewebapp.service;


import com.dev.incubator.simplewebapp.repository.UserRepository;
import com.dev.incubator.simplewebapp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User find(Long id) {
        return userRepository.findByIdUser(id);
    }

    public void save(User user){
        userRepository.save(user);
    }

}