package com.example.JWT.SpringJWT.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig
{
    @Bean
    public UserDetailsService userDetailsService()
    {
            UserDetails user =User.builder().username("Shreya").password(passwordEncoder().encode("123456")).roles("USER").build();
        UserDetails user1 =User.builder().username("Himadri").password(passwordEncoder().encode("111111")).roles("ADMIN").build();
            return new InMemoryUserDetailsManager(user,user1);

    }
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
}
