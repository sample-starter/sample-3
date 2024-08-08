package org.example.example.sql.service;

import org.example.example.sql.entities.User;
import org.example.example.sql.repositories.UserRepository;
import org.example.springframework.beans.factory.annotation.Autowired;
import org.example.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }

}
