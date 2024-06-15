package dev.rentranger.rentalsystem.config;

import dev.rentranger.rentalsystem.service.UserService;
import dev.rentranger.rentalsystem.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig2 {

    @Bean
    public UserService userService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return new UserService(userRepository, passwordEncoder);
    }
}
