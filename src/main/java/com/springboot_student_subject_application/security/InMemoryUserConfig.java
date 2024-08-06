package com.springboot_student_subject_application.security;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

    @Configuration
    public class InMemoryUserConfig {


        @Value("${app.security.user.name}")
        private String username;

        @Value("${app.security.user.password}")
        private String password;

        @Bean
        public UserDetailsService userDetailsService() {
            UserDetails user = User.builder()
                    .username(username)
                    .password("{noop}"+password) // {noop} means no password encoder
                    .roles("USER")
                    .build();

            return new InMemoryUserDetailsManager(user);
        }
    }
