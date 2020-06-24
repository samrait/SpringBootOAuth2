package com.security.oauth.SpringBootOAuth2;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.security.oauth.SpringBootOAuth2.entity.Role;
import com.security.oauth.SpringBootOAuth2.entity.User;
import com.security.oauth.SpringBootOAuth2.service.UserService;

@SpringBootApplication
public class SpringBootOAuth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOAuth2Application.class, args);
	}

	/*@Bean
    public CommandLineRunner setupDefaultUser(UserService service) {
        return args -> {
            service.save(new User(
                    "user", //username
                    "user", //password
                    Arrays.asList(new Role("USER"), new Role("ACTUATOR")),
                    true//Active
            ));
        };
    }*/
  
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }    
    
}
