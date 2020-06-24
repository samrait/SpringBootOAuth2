package com.security.oauth.SpringBootOAuth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.oauth.SpringBootOAuth2.entity.User;
import com.security.oauth.SpringBootOAuth2.repo.UserRepository;


@Service
public class UserService {

	@Autowired
    private UserRepository repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void save(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
    
}
