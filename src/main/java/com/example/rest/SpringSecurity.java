//package com.example.rest;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurity extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET,"/**").permitAll()
//                .antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
//                .antMatchers(HttpMethod.POST,"/**").permitAll()
//                .antMatchers(HttpMethod.PUT,"/**").permitAll()
//                .antMatchers(HttpMethod.DELETE,"/**").permitAll()
//                .antMatchers(HttpMethod.PATCH,"/**").permitAll()
//                .antMatchers(HttpMethod.TRACE,"/**").permitAll()
//                .antMatchers(HttpMethod.HEAD,"/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                //.formLogin().and()
//                .httpBasic();
//    }
//}