package com.example.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.ArrayList;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //super.configure(auth);
//        auth.inMemoryAuthentication().withUser("siraz").password("password123").authorities("ADMIN");
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        super.configure(http);
        //web.ignoring().antMatchers("/react-api/genericTask/getTasks", "react-api/interviewbitTask/getTasks");
        http.
                csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
                .antMatchers("/react-api/genericTask/getTasks", "/react-api/interviewbitTask/getTasks").permitAll()
                .anyRequest()
                .authenticated()
                .and().httpBasic();
    }



}
