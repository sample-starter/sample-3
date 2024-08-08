package org.example.example.service;

import org.example.example.entities.User;
import org.example.example.repositories.UserRepository;
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
