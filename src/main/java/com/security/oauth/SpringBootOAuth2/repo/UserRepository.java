package com.security.oauth.SpringBootOAuth2.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.oauth.SpringBootOAuth2.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Long>{

	Optional<User> findByUsername(String username);
	
}
